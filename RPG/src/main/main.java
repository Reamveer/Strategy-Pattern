package main;

import Classes.CharacterClass;
import Classes.CharacterFactory;
import Classes.Character;
import Classes.WrongCharacterClassException;
import Weaponry.Bow;
import Weaponry.Weapon;

public class main {

    public static void main(String[] args) throws WrongCharacterClassException {
        
        CharacterFactory factory = new CharacterFactory();
        
        Character c1 = factory.getCharacter(CharacterClass.DRUID);
        Weapon w = new Bow();
        
        c1.setName("Szymon");
        c1.setRace("Elf");
        c1.setWeapon(w);
        
        c1.getWeapon().atak();
    }

}
