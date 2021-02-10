public class rectangular_prism{
    private int l;
    private int w;
    private int h; 
    public rectangular_prism(){
        l = 1;
        w = 1; 
        h = 1;
    }
    public rectangular_prism(int l1, int w1, int h1){
        l = l1;
        w = w1;
        h = h1;
    }
    public int getVolume(){
        return l*w*h;
    }
    public long getSA(){
        return ((2*(l*w))+(2*(w*h))+(2*(h*l)));
    }

    public void add()
    {
          System.out.println("without this  is : "+w);
         System.out.println("THIS is : "+this.w);
    }
    
    public static void main(String[] args){
        rectangular_prism c1 = new rectangular_prism(1,2,3);
        //System.out.println("volume of basic is: "+c1.getVolume());
        
        rectangular_prism c2 = new rectangular_prism(6,7,8);
        //System.out.println("volume of basic is: "+c2.getVolume());  
        
        c1.add();
        c2.add();
    }
}
