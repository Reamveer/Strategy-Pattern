package Classes;

import CharacterSheet.Attributes;
import CharacterSheet.SavingThrows;
import CharacterSheet.State;

public class Warrior extends DefaultCharacter {

    Attributes attributes;
    SavingThrows savingthrows;
    State state;

    public Warrior() {
        super();
        attributes = new Attributes(18, 14, 16, 10, 12, 8);
        savingthrows = new SavingThrows(8, 4, 2, attributes);
        state = new State(18, 9, attributes);
    }

    @Override
    public Attributes getAttributes() {
        return attributes;
    }
    
    @Override
    public SavingThrows getSavingThrows() {
        return savingthrows;
    }
    
    @Override
    public State getState() {
        return state;
    }
}
