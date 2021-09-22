package ru.mirea.task6;

public class Lab6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Граф");
        Car car = new Car();
        Apple apple = new Apple(30);
        System.out.println(animal.getName());
        System.out.println(car.getName());
        System.out.println(apple.getPrice());
        System.out.println(car.getPrice());


    }

}
