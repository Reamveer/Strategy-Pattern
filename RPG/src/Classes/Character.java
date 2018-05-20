package Classes;

import CharacterSheet.Attributes;
import CharacterSheet.SavingThrows;
import CharacterSheet.State;
import Weaponry.Weapon;


public interface  Character {
    void setName(String name);
    void setRace(String race);
    void setWeapon(Weapon weapon);
    int getHP(int HP);
    String getRace();
    String getName();
    Weapon getWeapon();
    Attributes getAttributes();
    State getState();
    SavingThrows getSavingThrows();
    
}
