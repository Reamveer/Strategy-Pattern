package CharacterSheet;

public class State {

    private final int AC;
    private final int INITIATIVE;
    private final int BAB;

    public State(int AC, int BAB, Attributes A) {
        this.AC = AC + (A.getDEX() - 10) % 2;
        this.INITIATIVE = (A.getWIS() - 10) % 2;
        this.BAB = BAB;
    }

    public int getAC() {
        return AC;
    }

    public int getINITIATIVE() {
        return INITIATIVE;
    }

    public int getBAB() {
        return BAB;
    }
}
