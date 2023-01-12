package Ovelse1Hogwarts;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <HogwartsStudent> hogwartsStudents = new ArrayList<>();
        hogwartsStudents.add(new HogwartsStudent("Magnus", "zewis", "l"));
        hogwartsStudents.add(new HogwartsStudent("Zana", "Potter", "k"));

        Collections.sort(hogwartsStudents);
        for (HogwartsStudent hogwartsStudent : hogwartsStudents){
            System.out.println(hogwartsStudent);
        }

    }
}
