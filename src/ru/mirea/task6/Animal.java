package ru.mirea.task6;

public class Animal implements Nameable {
    private String name;

    public Animal(String name){
        this.name=name;
    }

    public Animal(){
        this.name ="Животное какое то";
    }

    @Override
    public String getName() {
        return name;
    }
}
