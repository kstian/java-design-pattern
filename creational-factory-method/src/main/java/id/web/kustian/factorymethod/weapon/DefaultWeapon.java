package id.web.kustian.factorymethod.weapon;

public class DefaultWeapon implements Attack {

    public void attack() {        
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Hand");
        System.out.println("Attack using Puch");
    }

}
