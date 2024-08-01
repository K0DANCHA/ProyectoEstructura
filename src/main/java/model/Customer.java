package model;

import java.util.Date;

public class Customer {
    private Long id;
    private String name;
    private String identification;
    private Date birthDate;
    private String gender;

    // Constructor
    public Customer(Long id, String name, String identification, Date birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.identification = identification;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "Customer{id=" + id + ", name='" + name + "', identification='" + identification + "', birthDate=" + birthDate + ", gender='" + gender + "'}";
//    }
}
