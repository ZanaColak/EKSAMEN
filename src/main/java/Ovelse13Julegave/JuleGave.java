package Ovelse13Julegave;

import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    Random random = new Random();

    public JuleGave(boolean isSoft, boolean isRectangular, boolean doesRattle){
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }
    public void couldBeLego(){
        if (isSoft() == true && isRectangular() == true && isDoesRattle() == true){
            System.out.println("Tillykke, din julegave er Lego");
        }else {
            System.out.println("Din julegave er desværre ikke Lego");
        }
    }

    public boolean isSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
    }

    public boolean isRectangular() {
        return isRectangular;
    }

    public void setRectangular(boolean rectangular) {
        isRectangular = rectangular;
    }

    public boolean isDoesRattle() {
        return doesRattle;
    }

    public void setDoesRattle(boolean doesRattle) {
        this.doesRattle = doesRattle;
    }
}
