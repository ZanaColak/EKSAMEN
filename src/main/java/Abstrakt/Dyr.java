package Abstrakt;

public abstract class Dyr {
    private String farve;
    private int vægt;

    public Dyr(String farve, int vægt){
        this.farve = farve;
        this.vægt = vægt;
    }
    public abstract String dyreLyde ();

}
