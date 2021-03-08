
public class Test {

    int x,y;    //instance variables
    
    static int p,q; //class variables
 
    
    public static void main(String[] args) {

       //instantiating class Test
       Test t1=new Test();
       Test t2=new Test();
       Test t3=new Test();
       t1.x=10;
       t2.x=20;
       t3.x=30;
       
        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        System.out.println("____________");
        t1.p=100;
        t2.p=200;
        t3.p=300;
        
        System.out.println(t1.p);
        System.out.println(t2.p);
        System.out.println(t3.p);
        System.out.println("____________");
        
    }
}
