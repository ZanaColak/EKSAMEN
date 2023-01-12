package Ovelse7KeyWord;

import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;

    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
    }
    public Keyword(){

    }
    public String matches(String søgeord){
        if (getWord().equalsIgnoreCase(søgeord)){
            System.out.println("Søgeordet matcher word!");
        }else {
            throw new RuntimeException("Søgeord matcher ikke");
        }
        return søgeord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
