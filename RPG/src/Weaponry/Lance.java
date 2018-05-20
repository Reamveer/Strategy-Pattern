package Weaponry;

public class Lance implements Weapon {

    @Override
    public String getName() {
        return "Lance";
    }

    @Override
    public int getDamage() {
        return 8;
    }

    @Override
    public void atak() {
        System.out.println("Stab Stab"); 
    }
}
