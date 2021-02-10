import java.io.*;
import java.util.Scanner;

public class Lottery
{
    public static void main(String[] args) throws Exception {
        //Switch case for each game
        int game = 0;
        System.out.println("Please enter which game you would like to play: ");
        Scanner inputFromKB = new Scanner(System.in);
        game = Integer.parseInt(inputFromKB.nextLine());

        int prize = 0; 
        switch (game){
            case 1:
                Scanner usernum = new Scanner(System.in); 
                System.out.println("Please enter a four digit number between 0000 and 9999");
                break;
            case 2: 
            
        }
        
        int min = 0000;
        int max = 9999; 
        //Get value from Random function
        int Lottery = (int)(Math.random() * (max - min + 1) + min);
       
        
        //Ask user for your lottery number. Enter number from keyboard
        int usernum = 0;
     
        System.out.println("Please enter a four digit number between 0000 and 9999");
        
        
        //Compare result and tell user you won or not.
        if (Lottery ==  usernum){
            prize = 50;
        }
     
    }
}
