package payme.makingPayments;

public class UserData2 {

    private String name;
    private String email;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public UserData2 setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserData2 setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserData2 setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserData2 setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "UserData2{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
