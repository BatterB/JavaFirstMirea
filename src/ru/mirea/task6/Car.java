package ru.mirea.task6;

public class Car implements Nameable{
    private String model;
    public Car(String model){
        this.model = model;
    }

    public Car(){
        this.model = "Неизвестный производитель";
    }

    @Override
    public String getName() {
        return model;
    }
}
