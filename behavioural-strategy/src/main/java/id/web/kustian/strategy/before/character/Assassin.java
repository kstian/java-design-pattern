package id.web.kustian.strategy.before.character;

public class Assassin extends CharacterObject {

    public Assassin() {
        this.setClassName("Assassin");
    }

    @Override
    public void attack() {
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Knife");
        System.out.println("Attack using Stealth Attack");
    }

}
