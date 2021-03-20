
public class Sample {
    private int x, y, z;

    public void m1(){
        //this();
    }
    
    public Sample(){
        m1();
    }
    
    public Sample(int p,int q){
        this();
        x=p;
        y=q;
    }
    
    public Sample(int a,int b,int c){
        this(a,b);  //calling a two int arg construcor.
        z=c;
    }
    
    /*
    public void setData(int p, int q){  //formal    p-10,q-20
        x=p;    
        y=q;
    }

    public void setData(int a, int b, int c){   //formal    a-10,b-20,c-30
        setData(a,b);   //actual
        z=c;
    }
    */
    
    public void show(){
        System.out.println(x+","+y+","+z);
    }
    public static void main(String[] args) {
        Sample ob1=new Sample(10,20,30);
        Sample ob2=new Sample(40,50);
        //ob1.setData(10, 20, 30);    //actual parameters
        //ob2.setData(50, 60);
        ob1.show();
        ob2.show();
    }
}
