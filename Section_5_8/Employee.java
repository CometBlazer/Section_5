package Section_5.Section_5_8;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;
    
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    
    public void work() {
        System.out.println(name + " is working...");
    }
    
    public void attendMeeting() {
        System.out.println(name + " is attending a meeting.");
    }
    
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    
    public double getSalary() {
        return salary;
    }
}
