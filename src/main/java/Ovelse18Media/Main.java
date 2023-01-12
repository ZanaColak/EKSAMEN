package Ovelse18Media;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Media> mediaArrayList = new ArrayList<>();

        Audio audio = new Audio("Boose", 20, 2.1);
        Video video = new Video("Apple", 30, 21.8);
        mediaArrayList.add(audio);
        mediaArrayList.add(video);

        for (Media media : mediaArrayList){
            System.out.println(media);
        }
    }
}
