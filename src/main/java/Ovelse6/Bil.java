package Ovelse6;

import java.util.Scanner;

public class Bil {
    private int vægt;

    public Trailer createCar(){
        boolean trailer = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skal bilen have trailer, eller ikke - JA/NEJ");
        if (scanner.nextLine().equalsIgnoreCase("ja")){
            trailer = true;
        } else if (scanner.nextLine().equalsIgnoreCase("nej")) {
            trailer = false;
        }
        System.out.println("Indtast vægt");
        int vægt = scanner.nextInt();
        if (vægt > 3500) {
            System.out.println("Vægten må ikke overstige 3500kg");
        } else {
            return new Trailer(vægt, trailer);
        }

        return null;
    }

}
