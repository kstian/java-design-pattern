package id.web.kustian.strategy.before.character;

public class Ranger extends CharacterObject {

    public Ranger() {
        this.setClassName("Ranger");
    }
    @Override
    public void attack() {
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Bow");
        System.out.println("Attack using Arrow Rain");
    }
}
