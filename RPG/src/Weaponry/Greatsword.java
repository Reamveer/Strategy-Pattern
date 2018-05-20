package Weaponry;


public class Greatsword implements Weapon {

        @Override
        public String getName() {
            return "Greatsword";
        }

        @Override
        public int getDamage() {
            return 10;
        }

    @Override
    public void atak() {
        System.out.println("Cut");
    }
    }
