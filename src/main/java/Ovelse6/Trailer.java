package Ovelse6;

public class Trailer {
    private int vægt;
    private boolean trailerEllerNej;
    private int vægtPåTrailer;

    @Override
    public String toString() {
        return "Trailer{" +
                "vægt=" + vægt +
                ", trailerEllerNej=" + trailerEllerNej +
                ", vægtPåTrailer=" + vægtPåTrailer +
                '}';
    }

    public Trailer(int vægt, boolean trailerEllerNej){
        this.vægt = vægt;
        this.trailerEllerNej = trailerEllerNej;
    }
    public Trailer(int vægt, boolean trailerEllerNej, int vægtPåTrailer){
        this.vægt = vægt;
        this.trailerEllerNej = trailerEllerNej;
        this.vægtPåTrailer = vægtPåTrailer;
    }

    public int getVægt() {
        return vægt;
    }

    public void setVægt(int vægt) {
        this.vægt = vægt;
    }

    public boolean isTrailerEllerNej() {
        return trailerEllerNej;
    }

    public void setTrailerEllerNej(boolean trailerEllerNej) {
        this.trailerEllerNej = trailerEllerNej;
    }

    public int getVægtPåTrailer() {
        return vægtPåTrailer;
    }

    public void setVægtPåTrailer(int vægtPåTrailer) {
        this.vægtPåTrailer = vægtPåTrailer;
    }


}
