package ua.kr.imp;

import ua.kr.logic.BaseEntity;

public class Person extends BaseEntity {

    private String firstnName;

    private String lastName;

    public String getFirstnName() {
        return firstnName;
    }

    public void setFirstnName(String firstnName) {
        this.firstnName = firstnName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + super.getId() + '\'' +
                "firstnName='" + firstnName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}