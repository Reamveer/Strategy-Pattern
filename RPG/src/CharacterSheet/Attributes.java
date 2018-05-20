package CharacterSheet;


public class Attributes {
    
    private final int STR;
    private final int DEX;
    private final int CON;
    private final int INT;
    private final int WIS;
    private final int CHA;

    public Attributes(int STR, int DEX, int CON, int INT, int WIS, int CHA) {
        this.STR = STR;
        this.DEX = DEX;
        this.CON = CON;
        this.INT = INT;
        this.WIS = WIS;
        this.CHA = CHA;
    }

    public int getDEX() {
        return DEX;
    }

    public int getCON() {
        return CON;
    }

    public int getINT() {
        return INT;
    }

    public int getWIS() {
        return WIS;
    }

    public int getCHA() {
        return CHA;
    }
    

}
