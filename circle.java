public class Circle
{
    private double radius;

    public Circle()
    {
        radius = 0;
    }
    
    public Circle (double r)
    {
        radius = r;
    }

    public double area()
    {
        return 3.14 * radius * radius;
    }

    public double circumfernce ()
    {
        return 2*3.14*radius;
    }


    public static void main (String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10.5);
        
        
        c1.radius 
        c2.radius
        System.out.println("Done");
        
        
    }
}