package Ovelse5Tal;

import java.util.Random;

public class Tal {

    Random random = new Random();

    public int randomNum(){
        int sum = 0;
        for(int i = 0; i < 1;  i++){ // For loopet er sat til 1, hvilket gør at der bliver printet 1 tal ud
            int num = random.nextInt(6) + 1; // Sætter grænseværdien til 6
            System.out.println(num);
        }
        return sum;
    }
    public void lavMangeTal(){
        for (int i = 0; i < 10; i++){ // 10 i for loopet gør at der printes 10 tal ud
            int num1 = random.nextInt(6) + 1; //Sætter grænseværdien til 6
            System.out.println(num1);
        }
    }
    public void getTilfældigeTal(){

    }
}
