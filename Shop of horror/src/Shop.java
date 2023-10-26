import java.util.*;

class Shop {
    String item;
    Double price;
    Integer amount;

    Shop(String item,Double price,Integer amount){
        this.item = item;
        this.price = price;
        this.amount = amount;
    }
    void inventory(int item){
        if(amount>=0){
            item =- amount;
        }
    }
    void info(){
        System.out.println(item+", "+price+" SEK "+amount+" left.");
    }
}
