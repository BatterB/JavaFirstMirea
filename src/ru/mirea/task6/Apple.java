package ru.mirea.task6;

public class Apple implements Priceble {
    private int price;

   public Apple(int price){
       this.price = price;
   }

   public Apple(){
       price = 20;
   }

    @Override
    public int getPrice() {
        return price;
    }
}
