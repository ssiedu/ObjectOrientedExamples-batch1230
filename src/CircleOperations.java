
public class CircleOperations {

    public static void main(String[] args) {

        //here we wish to compute area of circle with radius 10
        
        //create the instance (object)
        Circle c1=new Circle();
        c1.setRadius(10);
        
        //call the methods
        c1.computeArea();
        c1.computeCircumference();
        
        //here we wish to compute area of circle with radius 20
        Circle c2=new Circle();
        c2.setRadius(20);
        c2.computeArea();
        c2.computeCircumference();
        
        
        
    }
}
