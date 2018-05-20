package Weaponry;

public class Bow implements Weapon {

        @Override
        public String getName() {
            return "Bow";
        }

        @Override
        public int getDamage() {
            return 4;
        }

    @Override
    public void atak() {
        System.out.println("Shot");
    }
    }
