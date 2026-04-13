package Shape;

public class Circle {
    int radius;
    public String name;

    public Circle(int radius){
        this.radius=radius;
    }

    public double getArea() {

        return 3.14*radius*radius;
    }
}
