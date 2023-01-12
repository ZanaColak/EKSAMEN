package Ovelse18Media;

public class Video extends Media{
    private double aspectRatio;
    public Video(String name, int duration, double aspectRatio) {
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }

    @Override
    public String toString() {
        return "Video{" +
                "aspectRatio=" + aspectRatio +
                '}';
    }
}
