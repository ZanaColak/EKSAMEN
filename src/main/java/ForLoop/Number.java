package ForLoop;

import java.util.ArrayList;

public class Number {
  ArrayList<Integer> integerArrayList = new ArrayList<>();

    public void num(){
        integerArrayList.add(10);
        for (int i: integerArrayList){
            System.out.println(i);
        }
    }
}




