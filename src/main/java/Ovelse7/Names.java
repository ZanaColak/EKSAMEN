package Ovelse7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public Names(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        //TODO TAG HENSYN TIL AT DER MÅSKE IKKE ER ET MELLEMNAVN I TOSTRING METODEN
        return "Names{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
