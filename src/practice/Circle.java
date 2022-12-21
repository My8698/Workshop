package practice;
public class Circle {
    private int radius;
    public void setRadius(int r) {
        radius = r;
    }
    public void showCircumference() {
        double c = 2 * 3.14 * radius;
        System.out.println("Circumference is" + c);
    }
    public static void main (String[] args) {
     Circle c1=new Circle();
     c1.setRadius(5);
     c1.showCircumference();
    }
}