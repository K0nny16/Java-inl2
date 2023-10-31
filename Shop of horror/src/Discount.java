
class Discount extends Shop{
    private double discount;
    Discount(double discount,int slot,String item,double price,int amount){
        super(slot,item,price,amount);
        this.discount = discount;
    }
    double discountPrice(){
        setPrice(discount*getPrice());
        return (getPrice());
    }
}