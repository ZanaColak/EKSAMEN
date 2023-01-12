package ovelse2Beer;

public class Main {
    public static void main(String[] args) throws Exception {
        Beer beer = new Beer("Carlsberg", 110, 100);
        Beer beer1 = new Beer("Tuborg", 50,200);

        int sum = (beer.getPrice() + beer1.getPrice()); //Summen

        int gennemsnit = sum/2;
        System.out.println("Gennemsnittet er: " + gennemsnit); //Gennemsnittet

        beer.setPrice(-1);
        System.out.println(beer);


    }
}
