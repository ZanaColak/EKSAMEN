package Ovelse14Image;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image (String fileName, int width, int height){
       this.fileName = fileName;
       this.width = width;
       this.height = height;
    }
    public boolean isKnownFileType(){
        if (getFileName().equalsIgnoreCase("gif") || getFileName().equalsIgnoreCase("jpg") || getFileName().equalsIgnoreCase("jpeg")
                || getFileName().equalsIgnoreCase("png") || getFileName().equalsIgnoreCase("webp") || getFileName().equalsIgnoreCase("bmp")){
            System.out.println("korrekt");
            return true;
        }else {
            System.out.println("fejl");
            return false;
        }
    }
    public boolean isPortrait(){
        if (getHeight() > getWidth()){
            System.out.println("Dette er et portræt");
        }else {
            System.out.println("Eftersom at billedet ikke er højere end det er bredt er det ikke et portræt");
        }
        return true;
    }
    public void isLandScape(){
        if (getWidth() > getHeight()){
            System.out.println("Dette er et landskab");
        }else {
            System.out.println("Eftersom at bredten er højere end højden, er dette et landskab");
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
