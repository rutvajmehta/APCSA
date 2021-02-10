import java.util.*;
public class Assessment{
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for the size of your array");
        int arraySize = input.nextInt();
        int [] array = new int[arraySize]; 
        //int rand = (int)(Math.random()*100)+1;
        for (int i = 0; i <= array.length; i++){
            array[i] = (int)(Math.random()*100)+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void arraySort(){
        Scanner ascORdes = new Scanner(System.in);
        System.out.println("Please enter whether you would like the array is ascending or descending order: ");
        String aORd = ascORdes.next();
        if (aORd == "ascending")){
            // call sort for ascending order
            for (int i = 0; i < array.length - 1; i++){
            
            }
        } else {
            // call sort for descending order
        }
    }
    public int smallestElement(){
        
    }
    public int indexOfLargestElement(){
        
    }
}


import java.util.*;

// in CruiseDriver.java
public class CruiseDriver
{ 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Cruise cru = new Cruise(347, 119);
    //int result_code = new Cruise(347, 119); // NO!!!!!!!!!!!!1111111oneoneonewtfbbq!!!!11111
    cru.setPrice(129);
    Cruise dru = new Cruise(500, 500);
    dru.setPrice(333);
  }
}

// in Cruise.java
public class Cruise
{
  private int people; 
  private double price; 
  private double revenue;
  
  public Cruise(int num_people, double cur_price)
  {
    people = num_people;
    price = cur_price;
  }
  
  public void setPrice(double new_price)
  {
    price = new_price; // this --> "dru"
  }
  
  public void checkResponse(String request)
  {
    if (request.contains("cruise")){
    	people++; 	
    }  
    
  }
  
  public double calculateRevenue()
  {
    if (people >= 300) {
      revenue = people * (price - 500);
    }
    // <= < >= >
    if ((200 <= people) && (people < 300)){
      revenue = people * (price - 350);
    }
    if (people < 200){
      revenue = people * price;
    }
    return revenue; 
  }
}