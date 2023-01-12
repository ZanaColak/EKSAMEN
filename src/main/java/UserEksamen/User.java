package UserEksamen;

public class User implements Comparable <User>{
    private String fornavn;
    private String efternavn;
    private String eMail;
    private int tlfnr;

    public User(String fornavn, String efternavn, String eMail, int tlfnr){
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.eMail = eMail;
        this.tlfnr = tlfnr;
    }
    public User(String fornavn, String efternavn, String eMail){
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.eMail = eMail;
    }
    public String getFornavn(){
        return fornavn;
    }
    public String getEfternavn(){
        return efternavn;
    }
    public String geteMail(){
        return eMail;
    }
    public int getTlfnr(){
        return tlfnr;
    }
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }
    public void setEfternavn(String efternavn){
        this.efternavn = efternavn;
    }
    public void seteMail(String eMail){
        this.eMail = eMail;
    }
    public void setTlfnr(int tlfnr){
        this.tlfnr = tlfnr;
    }
    public String toString(){
        return "Fornavn: " + fornavn + "," + " Efternavn: " + efternavn + "," + " eMail: " + eMail + "," + " Telefon nummer: " + tlfnr;
    }

    @Override
    public int compareTo(User o) {
        return getEfternavn().compareTo(o.getEfternavn());
    }
}

