package com.engeto.ja.hotel;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate birthdate;



    public Guest(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return  "("+
                "name:'" + name + '\'' +
                "birtdate: "+birthdate+
                ')';
    }

    //region Přístupové metody
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    //endregion
}
