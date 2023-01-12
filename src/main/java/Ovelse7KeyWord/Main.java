package Ovelse7KeyWord;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Keyword keyword = new Keyword("hej", "hej");
        keyword.matches("hej");
        System.out.println(keyword);

        ArrayList<Keyword> keywords = new ArrayList<>();
    }
}
