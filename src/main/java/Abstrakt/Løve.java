package Abstrakt;

public class Løve extends Dyr{
    public Løve(String farve, int vægt) {
        super(farve, vægt);
    }

    @Override
    public String dyreLyde() { //Abstract method, method overriding. Overriding the method from "DYR"
        String lyd = "ghdhgdhd";
        System.out.println(lyd);
        return lyd;
    }
}
