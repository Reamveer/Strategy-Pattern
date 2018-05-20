package Classes;

import CharacterSheet.Attributes;
import CharacterSheet.SavingThrows;
import CharacterSheet.State;

public class Rouge extends DefaultCharacter {

    Attributes attributes;
    SavingThrows savingthrows;
    State state;

    public Rouge() {
        super();
        attributes = new Attributes(12, 18, 8, 14, 10, 14);
        savingthrows = new SavingThrows(4, 8, 2, attributes);
        state = new State(15, 7, attributes);
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
