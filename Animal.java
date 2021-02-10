
public class Animal
{
    public int legs;
    private boolean hair;

    public void setLegs(int l){
        legs = l;
        System.out.println("my legs are " +legs);
    }
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.setLegs(4);
        c.claw = true;
        
        tabby t = new tabby();
        t.legs = 4;
        t.claw = true;
        
        Human h = new Human();

        
    }
}

class Cat extends Animal
{
    public boolean claw;
    

}

class tabby extends Cat
{

  
}
class Human extends Animal
{

}

