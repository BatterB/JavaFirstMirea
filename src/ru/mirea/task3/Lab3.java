package ru.mirea.task3;

public class Lab3 {
    public static void main(String[] args)
    {
        Circle c1 = new Circle(15);
        System.out.println(c1);

        Human human = new Human(2, 5, 2);
        human.HumanWink();
        human.HumanClap();
        human.HumanCrisp();

        Book b = new Book();
        b.OutNP();
    }
}