public class User
{
    private int IdUser;
    private String Username;
    private String Password;

    public User() {
    }

    public User(int idUser, String username, String password) {
        IdUser = idUser;
        Username = username;
        Password = password;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
