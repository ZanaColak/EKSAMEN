package UserEksamen;

import java.util.ArrayList;
import java.util.Collections;

public class UserList {
    private ArrayList <User> users = new ArrayList<>();
    User user1 = new User("Zana", "zolak", "zanaColak@gmail.com", 50505050);
    User user2 = new User("Lone", "Jess", "hej@gmail.com");

    public void addUser(){
        users.add(user1);
        users.add(user2);

        Collections.sort(users);
        for (User user : users){
            System.out.println(user);
        }
    }
}
