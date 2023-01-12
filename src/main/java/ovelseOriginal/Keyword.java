package ovelseOriginal;

public class Keyword {
    private String word = "Zana";
    private String definition;

    public boolean matches(String søgeord){
        if (word.equalsIgnoreCase(søgeord)){
            return true;
        }
        return false;
    }


}


