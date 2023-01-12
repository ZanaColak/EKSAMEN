package Ovelse1Hogwarts;

public class HogwartsStudent implements Comparable <HogwartsStudent>{
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house){
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }
    public HogwartsStudent(){

    }

    public void setHouse(String house){
        this.house = house;
        if (getHouse().equalsIgnoreCase("Gryffindor")) {
            System.out.println("Det virker sku");
        }else if (getHouse().equalsIgnoreCase("Hufflepuff")){
                System.out.println("Det virker");
            } else if (getHouse().equalsIgnoreCase("Ravenclaw")){
                System.out.println("Det virker");
            } else if (getHouse().equalsIgnoreCase("Slytherin")){
                System.out.println("Det virker");
            }else {
            throw new RuntimeException("Fejl");
        }

    }
    public String getHouse(){
        return house;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Firstname: " + firstName +
                ", Lastname: " + lastName +
                ", House: " + house;
    }

    @Override
    public int compareTo(HogwartsStudent o) {
       return lastName.compareTo(o.lastName);
    }
}

