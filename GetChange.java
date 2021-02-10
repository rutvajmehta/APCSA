import java.util.Scanner;
public class GetChange
{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the price of your item: ");
        double cost  = input.nextDouble(); 
        
        System.out.print("Enter the amount paid for the item: ");
        double amtPaid  = input.nextDouble();
        
        double change = amtPaid - cost;
        
        System.out.println("Your change will be " + change);
        
        int totalCents = (int)(change * 100);
        
        int dollars = totalCents/100;
        
        System.out.println(totalCents);
        
        double cents = totalCents %100;
   
        System.out.println("Your dollars will be " + dollars + " and your cents will be " + cents);
        
        int quarters = (int)cents/25;
        
        int dimes = (((int)cents-(quarters * 25))/10);
        
        int nickels = (((int) cents - (quarters*25) - (dimes*10))/5);
        
        int pennies = (((int) cents - (quarters*25) - (dimes*10)) - (nickels*5)/1);
        
        System.out.println("Your quarters will be "+quarters+" , your dimes will be "+dimes+" , your nickels will be "+nickels + " , your pennies will be " + pennies);
    }
}
