package id.web.kustian.strategy.before.character;

public class Gunner extends CharacterObject {

    public Gunner() {
        this.setClassName("Sniper");
    }
    @Override
    public void attack() {
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Rifle");
        System.out.println("Attack using Bullet Lock");
    }
}
