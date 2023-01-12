package ovelse12;

public class User {
    private String fullName;
    private String userID = "magnus2450";

    public boolean validUserID(){
        boolean user = false;
        if (userID.isEmpty()){
            System.out.println("Failed");
        }else {
            System.out.println("test");
        }
        return true;
    }
    public void createUserID(){
        System.out.print(userID.substring(0,2));
        System.out.print(userID.substring(6,8));
        //Prints ma24, prints index position
    }


}
