import java.util.Scanner;
public class ComputeArea
{
   public static void main(String[] args) {
       double area;
       Scanner in = new Scanner(System.in);
       double n = in.nextDouble();
       area = n * n * Math.PI;
       System.out.println("The area of a circle with a radius of " + n + " is " + area);
    }
}
