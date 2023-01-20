
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu= new ArrayList<Cupcake>();

        Cupcake cupcake= new Cupcake();
        RedVelvet redVelvet= new RedVelvet();
        Chocolate chocolate= new Chocolate();

        Scanner scan= new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("\tHow much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceText= scan.nextLine();
        double price= Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("\tHow much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");

        priceText=scan.nextLine();
        price=Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("\tHow much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places)");

        priceText=scan.nextLine();
        price=Double.parseDouble(priceText);
        chocolate.setPrice(price);


        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //Drink parent and its objects
        ArrayList<Drink> drinkMenu= new ArrayList<Drink>();

        Drink water= new Drink();
        Soda soda=new Soda();
        Milk milk=new Milk();

        System.out.println("We are deciding on the price for our drinks. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        String priceTextDrinks= scan.nextLine();
        double priceDrinks=Double.parseDouble(priceTextDrinks);
        water.setPrice(priceDrinks);

        System.out.println("We are deciding on the price for our soda drink. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda drink? (Input a numerical number taken to 2 decimal places)");
        priceTextDrinks=scan.nextLine();
        priceDrinks=Double.parseDouble(priceTextDrinks);
        soda.setPrice(priceDrinks);

        System.out.println("We are deciding on the price for our milk drink. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk drink? (Input a numerical number taken to 2 decimal places)");
        priceTextDrinks=scan.nextLine();
        priceDrinks=Double.parseDouble(priceTextDrinks);
        milk.setPrice(priceDrinks);
        //This line of code uses the "Double.parseDouble()" method to convert the string value of "priceText" to a double and assigns it to the variable "price".


        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        Order order= new Order(cupcakeMenu,drinkMenu);



    }
}
class Cupcake{
    public double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
        return;

    }

}
class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
        return;
    }
}
class RedVelvet extends Cupcake{

    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        return;
    }
}

class Drink{
    public double price;
    public double getPrice(){ return price; }
    public  void setPrice(double price){ this.price=price; }
    public void type(){
        System.out.println("A bottle of water");
        return;


    }

}
class Milk extends Drink{
    public void type(){
        System.out.println("A bottle of Milk");
        return;
    }
}
class Soda extends Drink{
    public void type(){
        System.out.println("A bottle of soda");
        return;

    }
}