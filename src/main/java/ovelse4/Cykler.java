package ovelse4;

public class Cykler {
    private String mærke;
    private String farve;
    private int pris;

    public Cykler(String mærke, String farve, int pris){
        this.mærke = mærke;
        this.farve = farve;
        this.pris = pris;
    }
    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return "Cykler: " +
                "mærke: " + mærke + '\'' +
                ", farve: " + farve + '\'' +
                ", pris: " + pris;
    }
}
