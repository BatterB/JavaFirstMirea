package ru.mirea.task5;

public class Ovcharka extends Dog
{
    public Ovcharka(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " akita.");
    }
}
