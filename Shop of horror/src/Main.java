import java.util.*;

public class Main {

    public static void currency(String currency,double sum,Customer customer){
        HashMap<String,Double> Currencies = new HashMap<String,Double>();

        Currencies.put("SEK",1.00);
        Currencies.put("DKK",1.58);
        Currencies.put("Euro",11.78);
        if(currency.equalsIgnoreCase("SEK")){
            customer.sum = customer.sum*Currencies.get("SEK");
            customer.currency = "SEK";
        }
        if(currency.equalsIgnoreCase("DKK")){
            customer.sum = customer.sum*Currencies.get("DKK");
            customer.currency = "DKK";
        }
        if(currency.equalsIgnoreCase("Euro")){
            customer.sum = customer.sum*Currencies.get("Euro");
            customer.currency = "Euro";
        }
        else{
            customer.sum = customer.sum*Currencies.get("SEK");
            customer.currency = "SEK";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shop mask = new Shop(1,"Mask",250.70,17);
        Shop knife = new Shop(2,"Kniv",139.45,4);
        Shop fakeblood = new Shop(3,"Fake blood",89.10,20);

        Customer customer = new Customer(0.00,0,"SEK");

        System.out.println("Choose your option: ");
        boolean onOff = true;
        while(onOff){
            mask.info();
            knife.info();
            fakeblood.info();
            System.out.println("4: Quit.");
            int answer = scanner.nextInt();

            if(answer==1){
                mask.inventory(1);
                customer.checkout(mask.price);
            }
            if(answer==2){
                knife.inventory(1);
                customer.checkout(knife.price);
            }
            if(answer==3){
                fakeblood.inventory(1);
                customer.checkout(fakeblood.price);
            }
            if(answer==4){
                System.out.println("Vilken valuta vill du betala med SEK/DKK/Euro? (Default is SEK)");
                String choice = scanner.next();
                currency(choice,customer.sum,customer);
                customer.info();
                onOff = false;
            }
            else{
                System.out.println("Pick a option between 1 - 4! ");
            }
        }


    }
}