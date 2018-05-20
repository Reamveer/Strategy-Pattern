package Weaponry;

public class Dagger implements Weapon {

        @Override
        public String getName() {
            return "Dagger";
        }

        @Override
        public int getDamage() {
            return 2;
        }

    @Override
    public void atak() {
        System.out.println("Stab");
    }
    }