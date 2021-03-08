public class BankingApp {
public static void main(String[] args) {
        Account ac1=new Account();
        Account ac2=new Account();
        Account ac3=new Account();
        
        ac1.setData(1001, "ABC", 10000);
        ac2.setData(1002, "XYZ", 20000);
        ac3.setData(1003, "PQR", 30000);

        ac1.showData();
        ac2.showData();
        ac3.showData();
        
        /*
        ac1.setAno(1001); ac1.setName( "ABC"); ac1.setBal(10000);
        ac2.setAno(1002); ac2.setName("XYZ");  ac2.setBal(20000);
        ac3.setAno(1003); ac3.setName("PQR"); ac3.setBal(30000);
        System.out.println(ac1.getAno());
        System.out.println(ac1.getName());
        System.out.println(ac1.getBal());
        System.out.println("____________________________");
        System.out.println(ac2.getAno());
        System.out.println(ac2.getName());
        System.out.println(ac2.getBal());
        System.out.println("____________________________");
        System.out.println(ac3.getAno());
        System.out.println(ac3.getName());
        System.out.println(ac3.getBal());
        System.out.println("____________________________");
        */
    }    
}
