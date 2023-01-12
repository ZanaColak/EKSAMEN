package HospitalEksamen;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private String name;
    ArrayList<String> personale;
    Scanner sc = new Scanner(System.in);
    public Department (String name ){
        this.name=name;
        personale = new ArrayList<>();
    }
    public void tilføj(){
        System.out.println("Indtast et navn: ");
        String navn1 = sc.nextLine();
        sc.nextLine();
        System.out.println("Indtast endnu et navn: ");
        String navn2 = sc.nextLine();
        personale.add(navn1);
        personale.add(navn2);
        sc.nextLine();
        System.out.println("Indtast et navn som du ønsker at fjerne: ");
        String navn3 = sc.nextLine();
        personale.remove(navn3);
        personale.size();
        System.out.println(personale);
    }

    @Override
    public String toString() {
        return "Department: " +
                "name: " + name + '\'' +
                ", personale: " + personale;
    }
}
