package CharacterSheet;

public class SavingThrows {

    private final int FORTITUDE;
    private final int REFLEX;
    private final int WILL;

    public SavingThrows(int fo, int re, int wi, Attributes A) {
        FORTITUDE = fo + (A.getCON() - 10) % 2;
        REFLEX = re + (A.getDEX() - 10) % 2;
        WILL = wi + (A.getWIS() - 10) % 2;
    }

    public int getFORTITUDE() {
        return FORTITUDE;
    }

    public int getREFLEX() {
        return REFLEX;
    }

    public int getWILL() {
        return WILL;
    }

}
