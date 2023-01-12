package Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
  private String name;
    ArrayList <String> personale = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

  public Department(String name){
      this.name = name;
      personale = new ArrayList<String>();
  }
  public void tilføjPersonale(){
      System.out.println("Hvad er navnet på den ansatte?");
      String navn = scanner.nextLine();
      personale.add(navn);
  }
  public void fjernPersonale(){
      System.out.println("Navnet på et medlem du ønsker at fjerne: ");
      String navn1 = scanner.nextLine();
      personale.remove(navn1);
  }

    @Override
    public String toString() {
        return personale.size() + "Department{" +
                ", personale=" + personale;

    }
}
