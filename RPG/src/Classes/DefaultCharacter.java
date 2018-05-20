package Classes;

import CharacterSheet.Attributes;
import CharacterSheet.SavingThrows;
import CharacterSheet.State;
import Weaponry.Weapon;

public class DefaultCharacter implements Character {

    protected String name;
    protected String race;
    protected Weapon weapon;
    protected int HP = 100;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getHP(int HP) {
        return HP;
    }

    @Override
    public String getRace() {
       return race;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public Attributes getAttributes() {
        return null;
    }

    @Override
    public State getState() {
      return null;
    }

    @Override
    public SavingThrows getSavingThrows() {
        return null;
    }
}
