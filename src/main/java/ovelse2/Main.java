package ovelse2;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Batman");
        System.out.print(film.toString());
        Producer producer = new Producer("Michael");
        //Der kan kobles en producer på 2 måder, ved at lave en objekt af producer klassen, eller få lavet en setter
        producer.setName("Micheal");
        System.out.print(producer);
    }
}
