package Classes;

import CharacterSheet.Attributes;
import CharacterSheet.SavingThrows;
import CharacterSheet.State;

public class Druid extends DefaultCharacter {

    Attributes attributes;
    SavingThrows savingthrows;
    State state;
    

    public Druid() {
        super();
        attributes = new Attributes(12, 16, 12, 14, 18, 8);
        savingthrows = new SavingThrows(2, 4, 8, attributes);
        state = new State(12, 5, attributes);
        
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