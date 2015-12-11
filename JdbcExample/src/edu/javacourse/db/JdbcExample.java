package edu.javacourse.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample
{
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/st_student";
        String login = "postgres";
        String password = "postgres";
        Connection conn = DriverManager.getConnection(url, login, password);

//        testSelect(conn);
        long t = testInsert(conn);
        System.out.println(t);

        conn.close();
    }

    private static void testSelect(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM st_group");
//        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM st_group WHERE group_id < ?");
//        stmt.setInt(1, 10);
//        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Long groupId = rs.getLong("group_id");
            String groupName = rs.getString("groupName");
            String curator = rs.getString(3);
            System.out.println(groupId + ":" + groupName + ":" + curator);
        }
        rs.close();
        stmt.close();
    }

    private static long testInsert(Connection conn) throws Exception {
        long groupId = 0;
        String groupName = "Howard's school";
        String curator = "Подготовленный куратор";
        String speciality = "'''''''";
        PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO st_group (groupName, curator, speciality) VALUES (?, ?, ?)",
                new String[] {"group_id", "curator"});
        stmt.setString(1, groupName);
        stmt.setString(2, curator);
        stmt.setString(3, speciality);
        stmt.executeUpdate();
        
        ResultSet gk = stmt.getGeneratedKeys();
        while(gk.next()) {
            groupId = gk.getLong("group_id");
        }
        
        return groupId;
    }
}
