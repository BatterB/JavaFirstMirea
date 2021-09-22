package ru.mirea.task4;

public class TestAuthor {
    public static void testAuthor(){
        Author author = new Author("David","email@gmail.com",'M');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        author.setEmail("otherEmail@gmail.com");
        System.out.println(author.toStringAuthor());
    }
}
