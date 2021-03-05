public class Circle {
    
    //properties
    private double radius;
    private double area;
    private double circumference;
    private final static double PI=3.14;
    //operations
    public void setRadius(double r){
        
        radius=r;
    }
    public void computeArea(){
        area=PI*radius*radius;
        System.out.println("Area : "+area);
    }
    public void computeCircumference(){
        circumference=2*PI*radius;
        System.out.println("Circumference : "+circumference);
    }
}
