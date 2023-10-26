import java.util.*;

class Shop {
    int slot;
    String item;
    double price;
    static int amount;

    Shop(int slot,String item,double price,int amount){
        this.slot = slot;
        this.item = item;
        this.price = price;
        Shop.amount = amount;
    }
    void inventory(int item){
        if(amount>=0){
            amount = amount - item;
        }
    }
    void info(){
        System.out.println(slot+": "+item+", "+price+" SEK "+amount+" left.");
    }
}
