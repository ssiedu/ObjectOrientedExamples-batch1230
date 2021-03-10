
public class Account {

    //non-static (instance)
    private int ano;
    private String name;
    private int bal;
    //static  (class variable)
    private static int totalBal;
  
    
    //this method will compute average balance of any two accounts
    public static void showAvgBalance(Account tmp1, Account tmp2){
        System.out.println("Avg Balance Of 2 Accounts : "+(tmp1.bal+tmp2.bal)/2);
    }
    
    
    
    
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
