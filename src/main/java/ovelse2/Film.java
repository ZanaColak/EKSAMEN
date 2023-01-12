package ovelse2;

import java.time.LocalDate;

public class Film {
    private String filmTitel;
    private int udgivelsesår;
    Producer producer;

    public Film(String filmTitel, int udgivelsesår, Producer producer){
        this.filmTitel = filmTitel;
        this.udgivelsesår = udgivelsesår;
        this.producer = producer;
    }
    public Film(String filmTitel){
        this.filmTitel = filmTitel;
        udgivelsesår = LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return "Film: " + filmTitel +
                ", Udgivelsesår: " + udgivelsesår;
    }
}
