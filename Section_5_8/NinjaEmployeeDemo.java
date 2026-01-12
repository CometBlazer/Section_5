package Section_5.Section_5_8;

public class NinjaEmployeeDemo {
    public static void main(String[] args) {
        NinjaEmployee bob = new NinjaEmployee("Bob", "E12345", 75000, "Shadow Clan");
        
        // Employee behavior (inherited)
        bob.work();
        bob.attendMeeting();
        
        // Ninja behavior (delegated)
        bob.sneakAround();
        bob.throwStar();
        bob.vanish();
        
        // Unique NinjaEmployee behavior
        bob.infiltrateCompetition();
    }
}
