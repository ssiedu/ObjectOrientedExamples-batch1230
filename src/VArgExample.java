
public class VArgExample {

    public static void add(int... v){
        int sum=0;
        for(int num:v){
            sum=sum+num;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        
        add();      //{}
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(1,2,3,4,5,6,7,8,9,10);
        
    }
}
