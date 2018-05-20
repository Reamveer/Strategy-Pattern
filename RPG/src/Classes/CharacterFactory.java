package Classes;

public class CharacterFactory {

    public Character getCharacter(CharacterClass characterClass) throws WrongCharacterClassException {
        switch (characterClass) {
            case WARRIOR:
                return new Warrior();
            case ROUGE:
                return new Rouge();
            case DRUID:
                return new Druid();
            default:
                throw new WrongCharacterClassException();
        }
    }
}
