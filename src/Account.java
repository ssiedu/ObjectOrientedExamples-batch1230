
public class Account {

    private int ano;
    private String name;
    private int bal;

    public int getBal(){
        return bal;
    }
    public String getName(){
        return name;
    }
    public int getAno(){
        return ano;
    }


    public void setData(int x, String y, int z){
        ano=x; name=y; bal=z;
    }
    public void showData(){
            System.out.println(ano+","+name+","+bal);
    }
    
    public void setAno(int n){
        ano=n;
    }
    public void setName(String s){
        name=s;
    }
    public void setBal(int b){
        bal=b;
    }


    
}
