class Discount extends Shop{
    private double discount=0.9;
    Discount(int slot,String item,double price,int amount){
        super(slot,item,price,amount);
        setPrice(discountPrice());
    }
    double discountPrice(){
        setPrice(discount*getPrice());
        return getPrice();
    }
}