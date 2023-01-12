package AntalUnikkeEksamen;

import java.util.ArrayList;

public class Tekst {
    ArrayList <String> tekstLinjer = new ArrayList<>(); //ArrayList

    public void tilføj(String tekst){ //Metode med parametre
        tekstLinjer.add(tekst); //Parametre i metoden tilføjes i arraylisten, som vi laver i main klassen
    }
    public int findAntalUnikke(){ //Retur værdi, da vi skal returnere tekststrenge
        ArrayList <String> udenDuplicate = new ArrayList<>(); //En ekstra arrayliste
        for (String i: tekstLinjer){ //For each looper vi gennem vores arrayliste
            System.out.println(tekstLinjer);
            if (!udenDuplicate.contains(i)){ //
                udenDuplicate.add(i);
            }
        }
        return tekstLinjer.size();
    }
}
