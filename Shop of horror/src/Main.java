import java.util.*;

public class Main {

    public static void currency(String currency,double sum,Customer customer){
        HashMap<String,Double> Currencies = new HashMap<String,Double>();

        Currencies.put("SEK",1.00);
        Currencies.put("DKK",1.58);
        Currencies.put("Euro",11.78);
        if(currency.equalsIgnoreCase("SEK")){
            customer.setSum(customer.getSum()/Currencies.get("SEK"));
            customer.currency = "SEK";
        }
        if(currency.equalsIgnoreCase("DKK")){
            customer.setSum(customer.getSum()/Currencies.get("DKK"));
            customer.currency = "DKK";
        }
        if(currency.equalsIgnoreCase("Euro")){
            customer.setSum(customer.getSum()/Currencies.get("Euro"));
            customer.currency = "Euro";
        }
        else{
            customer.setSum(customer.getSum()/Currencies.get("SEK"));
            customer.currency = "SEK";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shop mask = new Shop(1,"Mask",250.70,17);
        Shop knife = new Shop(2,"Kniv",139.45,4);
        Discount fakeblood = new Discount(0.9,3,"Fake blood",89.10,10);

        Customer customer = new Customer(0.00,0,"SEK");

        boolean onOff = true;
        while(onOff){
            mask.info();
            knife.info();
            fakeblood.info();
            System.out.println("4: Quit.");
            System.out.println("Choose your option: ");
            int answer = scanner.nextInt();

            if(answer==1){
                customer.checkout(mask.getPrice(), mask.getAmount());
                mask.setAmount(1);
            }
            if(answer==2){
                customer.checkout(knife.getPrice(),knife.getAmount());
                knife.setAmount(1);
            }
            if(answer==3){
                customer.checkout(fakeblood.discountPrice(),fakeblood.getAmount());
                fakeblood.setAmount(1);
            }
            if(answer==4){
                System.out.println("Vilken valuta vill du betala med SEK/DKK/Euro? (Default is SEK)");
                String choice = scanner.next();
                currency(choice,customer.getSum(),customer);
                customer.info();
                onOff = false;
            }
            if(answer<0 || answer>4){
                System.out.println("Pick a option between 1 - 4! ");
            }
        }
    }
}