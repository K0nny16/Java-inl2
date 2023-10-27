import java.util.*;

class Shop {
    int slot;
    String item;
    double price;
     int amount;

    Shop(int slot,String item,double price,int amount){
        this.slot = slot;
        this.item = item;
        this.price = price;
        this.amount = amount;
    }
    void inventory(int item){
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
}
