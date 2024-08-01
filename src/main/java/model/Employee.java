package model;

public class Employee {
    private String name;
    private String identification;

    // Constructor
    public Employee(String name, String identification) {
        this.name = name;
        this.identification = identification;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    
}
