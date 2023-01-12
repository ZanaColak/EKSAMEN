package ovelse3;

import java.util.Arrays;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private int [] terninger;

    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
        terninger = new int[2];
    }
    public int ryst(){
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < antalTerninger; i++){ //Looper gennem vores antalTerninger
            int randomNum = random.nextInt(6) + 1; //Sætter grænseværdien til 6, Når vi siger plus 1 ved siden af parentesen, vil vi aldrig få et tal på under 1.
            sum = sum + randomNum;
            System.out.println(randomNum); //Får printet 2 forskellige numre ud
        }
        return sum;
    }
    public int se (){
        int se = 0;
        System.out.println(Arrays.toString(terninger)); //Printer listen ud, dog printer den bare 0,0 ud.
        return se;
    }
}
