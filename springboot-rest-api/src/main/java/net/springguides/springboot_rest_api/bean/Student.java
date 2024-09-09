package net.springguides.springboot_rest_api.bean;

public class Student {
    private int id;
    private  String firstName;
    private String lastname;

    public Student(int id, String firstName, String lastname){
        this.id =id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
