
public class Demo {

    private int x, y;
    
    public Demo(){
        x=100;y=100;
    }
    public Demo(int p){
        x=p;
    }
    
    public Demo(int a,int b){
        x=a;    y=b;
    }
    public void print(){
        System.out.println(x+","+y);
    }
    
    public static void main(String[] args) {
        
        Demo d=new Demo();
        Demo d1=new Demo(10);
        Demo d2=new Demo(20,30);
        //d1.setData(10, 20);
        //d2.setData(30, 40);
        d.print();
        d1.print();
        d2.print();
        
    }
}
