import java.util.*;

class Shop {
    private int slot;
    private String item;
    private double price;
    private int amount;

    Shop(int slot,String item,double price,int amount){
        this.slot = slot;
        this.item = item;
        this.price = price;
        this.amount = amount;
    }
    void setAmount(int item){
        if(amount- item>=0){
            amount = amount -item;
        }
        else{
            System.out.println("The product is out of stock!\n");
        }
    }
    void info(){
        System.out.println(slot+": "+item+" "+price+" SEK "+amount+" left.");
    }
    double getPrice(){
        return price;
    }
    int getAmount(){
        return amount;
    }
    void setPrice(double price){
        this.price = price;
    }
}
