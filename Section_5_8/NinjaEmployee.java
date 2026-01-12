package Section_5.Section_5_8;

public class NinjaEmployee extends Employee implements NinjaSkills {
    private Ninja ninjaDelegate;  // Composition - delegate ninja behavior
    
    public NinjaEmployee(String name, String employeeId, double salary, String clan) {
        super(name, employeeId, salary);
        this.ninjaDelegate = new Ninja(name, clan);  // Create internal Ninja object
    }
    
    // Delegate all ninja methods to the internal Ninja object
    @Override
    public void sneakAround() {
        ninjaDelegate.sneakAround();
    }
    
    @Override
    public void throwStar() {
        ninjaDelegate.throwStar();
    }
    
    @Override
    public void vanish() {
        ninjaDelegate.vanish();
    }
    
    // Can add unique behavior for ninja employees
    public void infiltrateCompetition() {
        System.out.println(getName() + " uses ninja skills for corporate espionage!");
    }
}
