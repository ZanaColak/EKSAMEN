package FilmEksamen;

import java.time.LocalDate;

public class Film {
    private String filmTitel;
    private int udgivelsesår;
    public Film(String filmTitel, int udgivelsesår){
        this.filmTitel = filmTitel;
        this.udgivelsesår = udgivelsesår;
    }
    public Film(String filmTitel){
        this.filmTitel = filmTitel;
        udgivelsesår = LocalDate.now().getYear();
    }


    @Override
    public String toString() {
        return "Filmtitel: " + filmTitel + '\'' +
                ", udgivelsesår: " + udgivelsesår;
    }
}
