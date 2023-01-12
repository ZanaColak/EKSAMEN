package Eksamen1;

import java.util.ArrayList;
import java.util.Collections;

public class User {
    ArrayList<String> users = new ArrayList<>();

    public void addUsers() {
        users.add("Zana");
        users.add("Heval");
        users.add("Magnus");
        users.add("Mikkel");
        users.add("Hjort");

        users.set(0,"Hans");
        Collections.sort(users);

        users.remove(3);
        users.set(0,"Poul");


        for (String i : users) {
            System.out.println(i);
        }

    }
}
