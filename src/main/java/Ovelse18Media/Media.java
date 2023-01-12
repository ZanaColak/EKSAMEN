package Ovelse18Media;

public abstract class Media {
    private String name;
    private int duration;

    public Media(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
