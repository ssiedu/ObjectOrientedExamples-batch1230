
public class Account {

    //non-static (instance)
    private int ano;
    private String name;
    private int bal;
    //static  (class variable)
    private static int totalBal;
  
    public Account(){
        
    }
    public Account(int a, String b){
        ano=a; name=b;
    }
    public Account(int x, String y, int z){
        this(x,y);
        bal=z;
        totalBal=totalBal+z;
    }
    
    
    
    //this method will compute average balance of any two accounts
    public static void showAvgBalance(Account... tmp){
        int n=tmp.length;   //size of array (no of account objects passed)
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+tmp[i].bal;
        }
        
        System.out.println("Avg Balance of "+n+" is "+(sum/n));
    }
    
    /*
    //this method will compute average balance of any three accounts
    public static void showAvgBalance(Account tmp1, Account tmp2, Account tmp3){
        System.out.println("Avg Balance Of 3 Accounts : "+(tmp1.bal+tmp2.bal+tmp3.bal)/3);
    }
    //this method will compute average balance of any four accounts
    public static void showAvgBalance(Account tmp1, Account tmp2, Account tmp3, Account tmp4){
        System.out.println("Avg Balance Of 3 Accounts : "+(tmp1.bal+tmp2.bal+tmp3.bal+tmp4.bal)/4);
    }
    */
    
    
    
    public void showBalance(){
        System.out.println("BALANCE IN "+ano+" IS "+bal);
    }
    
    public static void showTotal(){
        //to display the total balance (static)
        System.out.println("Total : "+totalBal);
    }
    
    public  void setData(int x, String y, int z){
        //to set the details of an individual object  (instance variables)
        ano=x; 
        name=y; 
        bal=z;
        //to increase the total balance (class variables)
        totalBal=totalBal+z;
    }
    
    public void showData(){
        // to display the details of an individual account (instance)
            System.out.println(ano+","+name+","+bal);
    }
        
}
