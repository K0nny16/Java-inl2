
class Discount extends Shop{
    private double discount;
    private double discountPrice = getPrice()*discount;
    Discount(double discount,int slot,String item,double price,int amount){
        super(slot,item,price,amount);
        this.discount = discount;
    }
    double getDiscountPrice(){
        getPrice()*discount=setPrice();
        return(setPrice());
    }
}