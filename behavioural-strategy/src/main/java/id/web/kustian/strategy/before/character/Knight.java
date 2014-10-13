package id.web.kustian.strategy.before.character;

public class Knight extends CharacterObject {
    
    public Knight() {
        this.setClassName("Knight");
    }
    @Override
    public void attack() {
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Sword");
        System.out.println("Attack using Sword Rumble");
    }
}
