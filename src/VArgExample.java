class Trial{}
public class VArgExample {

    public static void add(){
        System.out.println("Nothing-To-Add");
    }
    public static void add(double a,double b){
        System.out.println("SUM : "+(a+b));
    }
    public static void add(String... v){
        int tot=v.length;
        System.out.println("Total Elements Passed : "+tot);
        String res="";
        for(String s:v){
            res=res+s;
        }
        System.out.println(res);
    }
    public static void add(int... v){
        
        int sum=0;
        for(int num:v){
            sum=sum+num;
        }
        System.out.println(sum);
        
    }
    
    public static void main(String[] args) {
        
        add();
        add(10,20); 
        add("aa","bb");
        add("xx","yy","zz");
        add(10,20,30);
        add(10,20,30,40);
        
    }
}

/*
    some points to remember for using varargs
    
    1) only one varargs per method.
    2) normal parameters (non-varargs)  can be taken with varargs
    3) varargs must be always on last position
    4) varargs methods can be overloaded.
    5) preference is always given to exact match.



*/
