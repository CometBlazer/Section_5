package Section_5.Section_5_8;

public class Ninja implements NinjaSkills {
    private String name;
    private String clan;
    
    public Ninja(String name, String clan) {
        this.name = name;
        this.clan = clan;
    }
    
    @Override
    public void sneakAround() {
        System.out.println(name + " sneaks silently...");
    }
    
    @Override
    public void throwStar() {
        System.out.println(name + " throws a shuriken!");
    }
    
    @Override
    public void vanish() {
        System.out.println(name + " vanishes in smoke!");
    }
    
    public String getClan() {
        return clan;
    }
}
