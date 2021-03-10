public class BankingApp {
public static void main(String[] args) {
        Account ac1=new Account();
        Account ac2=new Account();
        Account ac3=new Account();
        
        ac1.setData(1001, "ABC", 10000);
        ac2.setData(1002, "XYZ", 20000);
        ac3.setData(1003, "PQR", 30000);

        Account.showAvgBalance(ac1, ac2);
        Account.showAvgBalance(ac2, ac3);
        Account.showAvgBalance(ac1, ac3);
        
        ///ac1.showAvgBalance(ac3);
        
        //ac1.showBalance();
        //ac2.showBalance();
        //ac3.showBalance();
       // ac1.showData();
       // ac2.showData();
       // ac3.showData();
       
        //Account.showTotal();
        
    }    
}
