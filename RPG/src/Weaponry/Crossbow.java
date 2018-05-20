package Weaponry;

public class Crossbow implements Weapon {

        @Override
        public String getName() {
            return "Crossbow";
        }

        @Override
        public int getDamage() {
            return 8;
        }

    @Override
    public void atak() {
        System.out.println("Stronger Shot");
    }
    }
