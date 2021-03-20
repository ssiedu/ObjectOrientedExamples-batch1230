public class BankingApp {
public static void main(String[] args) {
        Account ac1=new Account(111,"AAA",10000);
        Account ac2=new Account(112,"BBB",20000);
        Account ac3=new Account(113,"CCC",30000);
        Account ac4=new Account(114,"DDD",40000);
        Account ac5=new Account(115,"EEE");
        Account ac6=new Account();
        ac6.setData(116, "FFF", 60000);
        //ac1.setData(1001, "ABC", 10000);
        //ac2.setData(1002, "XYZ", 20000);
        //ac3.setData(1003, "PQR", 30000);
        //ac4.setData(1004, "MNO", 40000);
        //ac5.setData(1005, "RST", 50000);
        ac1.showData();
        ac2.showData();
        ac3.showData();
        ac4.showData();
        ac5.showData();
        ac6.showData();
        
        /*
        ac1.setData(1001, "ABC", 10000);
        ac2.setData(1002, "XYZ", 20000);
        ac3.setData(1003, "PQR", 30000);
        ac4.setData(1004, "MNO", 40000);
        ac5.setData(1005, "RST", 50000);
        Account.showAvgBalance(ac1, ac2);
        Account.showAvgBalance(ac1,ac2,ac3);
        Account.showAvgBalance(ac1,ac2,ac3,ac4);
        Account.showAvgBalance(ac1,ac2,ac3,ac4,ac5);//{ac1,ac2,ac3,ac4,ac5}
        */
        //Account.showAvgBalance(ac2, ac3);
        //Account.showAvgBalance(ac1, ac3);
        
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
