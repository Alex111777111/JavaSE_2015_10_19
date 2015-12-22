package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.PropertyResourceBundle;

public class LiveUserDbDAO implements LiveUserDAO
{
    private static final String INSERT = "INSERT INTO lj_user (user_alias, user_email, user_password) "
            + "VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE lj_user SET user_alias=?, user_email=?, user_password=? "
            + "WHERE user_id = ?";
    private static final String DELETE = "DELETE FROM lj_user WHERE user_id = ?";
    private static final String SELECT_ONE = "SELECT * FROM lj_user WHERE user_id = ?";
    private static final String SELECT_ALL = "SELECT * FROM lj_user ORDER BY user_alias";

    private static String url;
    private static String login;
    private static String password;

    static {
        try {
            PropertyResourceBundle pr = (PropertyResourceBundle) PropertyResourceBundle.getBundle("database");
            url = pr.getString("dao.url");
            login = pr.getString("dao.login");
            password = pr.getString("dao.password");
            Class.forName(pr.getString("dao.driver"));
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, login, password);
    }

    @Override
    public long addLiveUser(LiveUser user) throws LiveJournalDAOException {
        long userId = -1;
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(INSERT, new String[] {"user_id"});
                stmt.setString(1, user.getAlias());
                stmt.setString(2, user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.executeUpdate();
                ResultSet gk = stmt.getGeneratedKeys();
                while(gk.next()) {
                    userId = gk.getLong(1);
                }
                gk.close();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new LiveJournalDAOException(ex);
        }
        return userId;
    }

    @Override
    public void updateLiveUser(LiveUser user) throws LiveJournalDAOException {
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(UPDATE);
                stmt.setString(1, user.getAlias());
                stmt.setString(2, user.getEmail());
                stmt.setString(3, user.getPassword());
                stmt.setLong(4, user.getUserId());
                stmt.executeUpdate();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new LiveJournalDAOException(ex);
        }
    }

    @Override
    public void deleteLiveUser(long userId) throws LiveJournalDAOException {
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(DELETE);
                stmt.setLong(1, userId);
                stmt.executeUpdate();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new LiveJournalDAOException(ex);
        }
    }

    @Override
    public LiveUser getLiveUser(long userId) throws LiveJournalDAOException {
        LiveUser user = null;
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(SELECT_ONE);
                stmt.setLong(1, userId);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()) {
                    user = new LiveUser();
                    user.setUserId(rs.getLong("user_id"));
                    user.setAlias(rs.getString("user_alias"));
                    user.setEmail(rs.getString("user_email"));
                    user.setPassword(rs.getString("user_password"));
                }
                rs.close();
                stmt.close();
            } finally {
                conn.close();
            }
            if(user == null) {
                throw new LiveJournalDAOException("No user iwth ID:" + userId);
            }
        } catch (SQLException ex) {
            throw new LiveJournalDAOException(ex);
        }
        return user;
    }

    @Override
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) throws LiveJournalDAOException {
        List<LiveUser> users = new LinkedList<>();
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()) {
                    LiveUser user = new LiveUser();
                    user.setUserId(rs.getLong("user_id"));
                    user.setAlias(rs.getString("user_alias"));
                    user.setEmail(rs.getString("user_email"));
                    user.setPassword(rs.getString("user_password"));
                    
                    users.add(user);
                }
                rs.close();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new LiveJournalDAOException(ex);
        }
        return users;
    }

}
