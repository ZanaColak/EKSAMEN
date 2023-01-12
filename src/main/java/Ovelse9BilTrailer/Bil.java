package Ovelse9BilTrailer;

import java.util.Scanner;

public class Bil {
    private Trailer trailer = new Trailer(2000);
    private int vægt;
    private Scanner sc = new Scanner(System.in);

    public Bil(int vægt) {
        this.vægt = vægt;
    }

    public int totalVægt() {
        int sum = 0;
        System.out.println("Ønsker du at tilkoble en trailer? (JA/NEJ)");
        System.out.println("Traileren og bilem må ikke veje mere end 3500 kg til sammen. ");
        sum += getVægt();
        System.out.println("Bilen vejer i øjeblikket: " + sum);
        String svar = sc.nextLine();
        if (svar.equalsIgnoreCase("nej")) {
            System.out.println("Du har valgt at takke nej til en trailer");
        } else if (svar.equalsIgnoreCase("ja")) {
            System.out.println("Du har valgt at takke ja, til at have en trailer tilkoblet");
            sum = getVægt() + trailer.getVægt();
            System.out.println("I øjeblikket vejer din bil og traileren til sammen: " + sum);
        }
        if (getVægt() > 3500) {
            throw new RuntimeException("Desværre, din bil alene vejer mere end 3500 kg, den vejer: " + sum);
        }
        return sum;
    }

    public int getVægt() {
        return vægt;
    }

}
