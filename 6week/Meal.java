import Shape.Circle;

public class Meal {
    
    public static void main(String[] args) {
    Circle pizza;
    pizza = new Circle(8);
    pizza.name = "javapizza";
    double area = pizza.getArea();
    System.out.println(pizza.name + " has area " + area);

    Circle donut = new Circle(4);
    donut.name = "javadonut";
    double areaDonut = donut.getArea();
    System.out.println(donut.name + " has area " + areaDonut);
    }
}
