package AntalUnikkeEksamen;

public class Main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();
        tekst.tilføj("dhdh");
        tekst.tilføj("ndj");
        tekst.tilføj("dhdh");

        System.out.println(tekst.findAntalUnikke());

    }
}
