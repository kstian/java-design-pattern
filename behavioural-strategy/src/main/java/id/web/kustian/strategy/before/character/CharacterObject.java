package id.web.kustian.strategy.before.character;


public class CharacterObject {
    private String className="Base Character";
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void attack() {
        System.out.println("Checking MP and SP");
        System.out.println("Prepare weapon : Hand");
        System.out.println("Attack using Puch");
    }
}
