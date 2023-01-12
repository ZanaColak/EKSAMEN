package Casting;

public class TypeCasting {
    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();
        typeCasting.casting();
    }
    public void casting() {
        int num = 10;
        double casting = (double) num; // Ændres fra en integer til en double
        //For at man kan caste, skal man have parenteser rundt om den datatype man ønsker at ændre til
        System.out.println(casting);
        //Gik fra at printe 10, til 10.0

    }
}
