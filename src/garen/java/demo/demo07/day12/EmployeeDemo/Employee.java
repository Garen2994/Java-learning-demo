package garen.java.demo.demo07.day12.EmployeeDemo;

public abstract class Employee {

    private String id;
    private String name;

    public Employee() {
        super();

    }

    public Employee(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void work();
}
