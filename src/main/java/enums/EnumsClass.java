package enums;

public enum EnumsClass {
    SOMMER, VINTER, FORÅR, EFTERÅR;

    public void printEnum(){
        EnumsClass enumsClass = EnumsClass.SOMMER; //Sætter den til at være Sommer
        switch (enumsClass){
            //Lambda switch case
            case FORÅR -> System.out.println("Forår!");
            case EFTERÅR -> System.out.println("Efterår!");
            case VINTER -> System.out.println("Vinter!");
            case SOMMER -> System.out.println("Sommer!");
        }
    }
}
