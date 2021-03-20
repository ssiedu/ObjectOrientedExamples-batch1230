
public class Test {

    int x, y;   
    
    public Test(int a, int b){
        x=a;y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }
    
    public static void main(String[] args) {
        Test t1=new Test(10,20);
        Test t2=new Test(10,20);
        Test t3=t1;
        boolean res1=(t1==t2);
        boolean res2=(t1==t3);
        System.out.println(res1);
        System.out.println(res2);
        
    }
}
