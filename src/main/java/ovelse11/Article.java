package ovelse11;


import java.util.ArrayList;

public class Article {
    ArrayList <String> arrayList = new ArrayList<>();
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }
    public void getLongestWord() {

    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
