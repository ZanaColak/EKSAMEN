package PatternForLoop;

public class ForILoop {
    //Nested for loop kaldes dette
    //Et inner-loop
    //Et outer-loop
    public void pattern() {
        for (int i = 1; i <= 5; i++) { // 5 tallet i dette looper bestemmer, hvor mange
            // gange der printes ud. (Row)
            for (int j = 0; j < i; j++) {// (I)2 tallet her, gør sådan så at der bliver printet
                // 2 stjerner på hver linje 5 gange. (Columns)
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--){
            for (int j = 0; j < i; j++) {// (I)2 tallet her, gør sådan så at der bliver printet
                // 2 stjerner på hver linje 5 gange. (Columns)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
