

//we are creating the blueprint of an Student object

public class Student {

    // properties of an object  (the variables we declare to hold propery values are called data members of class)
        private int rno,maths,physics,chemistry,total,per;
        private String name;
        
    
    // behaviour of an object
        public void setMarks(int m, int p, int c){
            maths=m;
            physics=p;
            chemistry=c;
        }
        public void showTotal(){
            total=maths+physics+chemistry;
            System.out.println("Total Marks : "+total);
        }
        public void showPer(){
            per=total/3;
            System.out.println("Percentage : "+per);
        }
        
        
}
