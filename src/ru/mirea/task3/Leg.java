package ru.mirea.task3;

public class Leg {
    private int numOfLegs;

    public Leg(int numOfLegs)
    {
        this.numOfLegs = numOfLegs;
    }

    public Leg()
    {
        this.numOfLegs = 2;
    }

    public void Crisp()
    {
        System.out.println("Кажется что то хрустнуло под ногами...");
    }
}
