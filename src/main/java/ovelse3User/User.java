package ovelse3User;

public class User {
    private String userName;
    private int userID;

    public User(String userName, int userID){
        this.userName = userName;
        this.userID = userID;
    }
    public enum Roles {
        ADMIN, EDITOR, READER
    }
}

