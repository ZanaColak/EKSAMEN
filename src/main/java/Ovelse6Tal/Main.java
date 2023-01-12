package Ovelse6Tal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tal tal = new Tal();
        tal.tælTal(66);
        System.out.println(Arrays.toString(tal.talArray));
        tal.beregnGennemsnit();
    }
}
