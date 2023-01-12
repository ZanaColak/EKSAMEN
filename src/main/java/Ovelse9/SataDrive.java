package Ovelse9;

public class SataDrive {
    private String sataDrive1;
    private String sataDrive2;
    private String sataDrive3;
    private String sataDrive4;

    public SataDrive(String sataDrive1, String sataDrive2, String sataDrive3){
        this.sataDrive1 = sataDrive1;
        this.sataDrive2 = sataDrive2;
        this.sataDrive3 = sataDrive3;
    }
    public SataDrive(String sataDrive1, String sataDrive2){
        this.sataDrive1 = sataDrive1;
        this.sataDrive2 = sataDrive2;
    }
    public SataDrive(String sataDrive1){
        this.sataDrive1 = sataDrive1;
    }

    public SataDrive(String sataDrive1, String sataDrive2, String sataDrive3, String sataDrive4){
        this.sataDrive1 = sataDrive1;
        this.sataDrive2 = sataDrive2;
        this.sataDrive3 = sataDrive3;
        this.sataDrive4 = sataDrive4;
    }

    public String getSataDrive1() {
        return sataDrive1;
    }

    public void setSataDrive1(String sataDrive1) {
        this.sataDrive1 = sataDrive1;
    }

    public String getSataDrive2() {
        return sataDrive2;
    }

    public void setSataDrive2(String sataDrive2) {
        this.sataDrive2 = sataDrive2;
    }

    public String getSataDrive3() {
        return sataDrive3;
    }

    public void setSataDrive3(String sataDrive3) {
        this.sataDrive3 = sataDrive3;
    }

    public String getSataDrive4() {
        return sataDrive4;
    }

    public void setSataDrive4(String sataDrive4) {
        this.sataDrive4 = sataDrive4;
    }
}
