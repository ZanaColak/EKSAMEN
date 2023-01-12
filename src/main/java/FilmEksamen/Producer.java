package FilmEksamen;

public class Producer extends Film {
    private String producer;

    public Producer(String filmTitel, int udgivelsesår) {
        super(filmTitel, udgivelsesår);
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Producer: "  + producer;
    }
}
