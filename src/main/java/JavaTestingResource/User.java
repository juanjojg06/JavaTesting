package JavaTestingResource;

public class User {

    private String username;
    private String salt;
    private String passwordHash;


    public User(String username, String passwordEnTextoPlano, String salt) {
        this.username = username;
        this.salt = salt;

        this.passwordHash = PasswordHash.generatePasswordHash(passwordEnTextoPlano, salt);
    }

    public String getUsername() {
        return username;
    }

    public String getSalt() {
        return salt;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

}
