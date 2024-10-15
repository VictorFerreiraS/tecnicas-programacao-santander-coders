package org.example.exercice2;

public class Client {
    String name;
    String email;
    Integer age;
    Boolean isVip;

    public Client(String name, String email, Integer age, Boolean isVip) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isVip = isVip;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getVip() {
        return isVip;
    }
}
