package Ovelse6Tal;

import java.util.Arrays;

public class Tal {
    int[] talArray = {5, 66, 12, 87, 66, 56, 89, 66};

    public int tælTal(int num) {
        int forekomster = 0;

        for (int i : talArray) {
            if (num == i) {
                forekomster++;
                System.out.print("Antal forekomster: ");
                System.out.println(forekomster);
            }
        }
        return forekomster;
    }
    public void beregnGennemsnit(){
        System.out.print("Gennemsnittet er: ");
        System.out.println(Arrays.stream(talArray).average());
    }
}

