package Ovelse8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;
    private int lowest; //Grænseværdien, den attribut der skal bruges til formlen
    private Scanner sc = new Scanner(System.in);

    public void acceptableDate() {
        do {
            System.out.println("Hvor gammel er du?: ");
            yourAge = sc.nextInt();
            System.out.println("Hvor gammel er din date?: ");
            dateAge = sc.nextInt();

            lowest = (yourAge / 2 + 7); // Formlen

            if (dateAge >= lowest) {
                System.out.println("Din date er ok");
            } else {
                System.out.println("Ups, din date er ikke ok ");
                break;
            }
        }while (yourAge != dateAge);

        }

    }

