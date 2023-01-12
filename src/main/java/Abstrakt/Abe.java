package Abstrakt;

public class Abe extends Dyr{
    public Abe(String farve, int vægt) {
        super(farve, vægt);
    }

    @Override //Abstract method, method overriding. Overriding the method from "DYR"
    public String dyreLyde() {
        String lyd = "uauauauaua";
        System.out.println(lyd);
        return lyd;
    }
}
