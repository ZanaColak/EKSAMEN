package ovelse4;

import java.util.ArrayList;

public class Butik {
    ArrayList <Cykler> cyklerArrayList = new ArrayList<>();
    Cykler cykler = new Cykler("gddh", "Rød", 100);
    Cykler cykler1 = new Cykler("hdhd", "grøn", 800);

    public void tilføj(){ //DEl 2
        cyklerArrayList.add(cykler);
        cyklerArrayList.add(cykler1);
    }
    public int samletLagerBeholdning (){ //del 3
        int sum = 0;
        cykler.getPris();
        cykler1.getPris();
        System.out.println(cykler + " Kr.");
        System.out.println(cykler1 + " Kr.");

        int i = sum + (cykler.getPris() + cykler1.getPris()); //Summen af den samlede pris
        System.out.println("Den samlede pris for cyklerne er: " + i);
        return sum;
    }
}
