import java.io.*;
public class Helloworld {

    /* static String F1 (String chaman)
    {
        int R,U,T,V,A;
        System.out.println("in F1" +chaman);
        
        chaman = "JIG";
        return chaman;
    }
    */
   
    static double pythag(double num1, double num2)
    {
        double num3 = Math.sqrt((num1*num1) +(num2*num2));
        return num3; 
    }
    
    public static void main(String[] args) {
        /*int x = 7;
        
        System.out.printf("%5d\n", 1);
        System.out.printf("%5d\n", 12);
        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        char ch = 'R';
        String chaman = "Rut";
        
        String cc = F1(chaman);
        System.out.printf("%5c\n", ch);
        System.out.printf("%5s\n", chaman);

        int y = 17;
        int z = 3;
        System.out.println(Math.pow(y, z));
        
        double cracker = 53290.239;
        System.out.printf("%10.4e\n", cracker);
        */
       
        double a = 3;
        double b = 4;
        
        double c = pythag(a, b);
        
        System.out.println("a^2+b^2 = " +c);
        
    }
}
