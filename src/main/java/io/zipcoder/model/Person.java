package io.zipcoder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Person {
    private String firstName;
    private String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idNum;
public Person(String firstName, String lastName, int idNum) {
this.firstName = firstName;
this.lastName = lastName;
this.idNum = idNum;
}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }


public Person(){

}

}
