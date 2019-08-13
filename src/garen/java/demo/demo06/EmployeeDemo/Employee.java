package garen.java.demo.demo06.EmployeeDemo;

public abstract class Employee {

    private String id ;
    private String name = "Nill";

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
