package ovelse2Beer;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private int price;

    public Beer(String name, double alcoholPercentage, int price){
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.price = price;
    }
    public Beer(){

    }

    public void setAlcoholPercentage(double alcoholPercentage) throws Exception {
        this.alcoholPercentage = alcoholPercentage;
        if (getAlcoholPercentage() > 100){
            throw new Exception ("Alkohol procenten må ikke være højere end 100"); // Alkohol procent må ikke være højere end 100
        } else if (getAlcoholPercentage() < 0) {
            throw new Exception("Værdien må ikke være negativ"); //Negativ værdi
        }

    }
    public void setPrice(int price) throws RuntimeException{
        this.price = price;
        if (getPrice() < 0){
            throw new RuntimeException("Værdien må ikke være negativ"); //Negativ værdi
        }
    }

    public String getName() {
        return name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public int getPrice() {
        return price;
    }
}
