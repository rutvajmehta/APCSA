import java.util.Scanner;
public class triangle
{
    private double angle1;
    private double angle2; 

    public triangle(){
        angle1 = 0.0;
        angle2 = 0.0; 
    }

    public triangle(double x, double y){
        angle1 = x;
        angle2 = y;
    }
    
    public double getAngle(){
        return (180 - angle1 - angle2);
    }
    
    public double setAngle1(double a){
        angle1 = a;
        return angle1;
    }
    
    public double setAngle2(double b){
        angle2 = b;
        return angle2;
    }
    
    public static void main(String[] args){
        triangle t1 = new triangle(65, 72.3);
        triangle t0 = new triangle();
        System.out.println("with orignal values t1: "+t1.getAngle());
        System.out.println("with orignal values t0: "+t0.getAngle());
        
        Scanner scFirstAngle = new Scanner(System.in);
        System.out.println("Enter first angle");

        double firstAngle = scFirstAngle.nextDouble();
        System.out.println("Enter second angle");
        double secondAngle = scFirstAngle.nextDouble();
        
        t1.setAngle1(firstAngle);
        t1.setAngle2(secondAngle);
        System.out.println("with set values t1:"+t1.getAngle());
        t0.setAngle1(23);
        t0.setAngle2(90);
        System.out.println("with set values t0:"+t0.getAngle());        
    }
}
