package FilmEksamen;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Batman");
        System.out.println(film.toString());
        Producer producer = new Producer("Batman", 2019);
        producer.setProducer("John");
        System.out.println(producer.toString());
    }
}
