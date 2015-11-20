package edu.javacourse.live.entity;

public class LiveUser
{
    private long userId;
    private String alias;
    private String password;
    private String email;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.userId ^ (this.userId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LiveUser other = (LiveUser) obj;
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public Object clone() {
        LiveUser lu = new LiveUser();
        lu.setAlias(alias);
        lu.setEmail(email);
        lu.setPassword(password);
        lu.setUserId(userId);
        return lu;
    }

    
    
}
