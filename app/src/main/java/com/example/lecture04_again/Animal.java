package com.example.lecture04_again;

public class Animal {
    private String age;
    private String color;
    private String name;
    public Animal (String age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
