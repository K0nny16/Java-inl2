public class Customer {
    private double sum = 0;
    int cart = 0;
    String currency;

    Customer(double sum,int cart,String currency){
        this.currency = currency;
        this.sum = sum;
        this.cart = cart;
    }
    void checkout(double price, int amount){
        if(amount>0){
            sum = getSum() + price;
            cart++;
        }
    }
    void info(){
        System.out.println("You purchased a total of "+cart+" items. The total cost was "+(float)sum+" "+currency);
    }
    double getSum(){
        return sum;
    }
    void setSum(double sum){
        this.sum = sum;
    }
}
