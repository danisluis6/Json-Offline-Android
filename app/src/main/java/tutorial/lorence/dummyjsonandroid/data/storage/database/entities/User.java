package tutorial.lorence.dummyjsonandroid.data.storage.database.entities;

/**
 * Created by vuongluis on 4/14/2018.
 *
 * @author vuongluis
 * @version 0.0.1
 */

public class User {
    private int userid;
    private String username;
    private String password;
    private String fullname;
    private String path;
    private String email;
    private String address;

    public User() {
    }

    public User(int userid, String username, String password, String fullname, String avatar, String email, String address) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.path = avatar;
        this.email = email;
        this.address = address;
    }

    public int getUserID() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
