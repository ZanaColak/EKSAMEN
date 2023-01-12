package Ovelse18Media;

public class Audio extends Media{
    private double loudness;
    public Audio(String name, int duration, double loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "loudness=" + loudness +
                '}';
    }
}
