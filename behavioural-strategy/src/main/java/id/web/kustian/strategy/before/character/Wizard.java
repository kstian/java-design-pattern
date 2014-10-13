package id.web.kustian.strategy.before.character;

public class Wizard extends CharacterObject {

    public Wizard() {
        this.setClassName("Wizard");
    }
    @Override
    public void attack() {
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Staff");
        System.out.println("Attack using Fire Bolt");
    }
}
