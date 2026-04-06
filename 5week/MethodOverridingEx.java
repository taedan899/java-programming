class Shape {
    public void draw(){
        System.out.println("shape");

    }

}

class Line2 extends Shape{
    public void draw(){
        System.out.println("Line");
    }

}

class Reat extends Shape {
    public void draw() {
        System.out.println("Reat");
    }

}

class Circle extends Shape {
    public void draw(){
        System.out.println("Circle");
    }
    
}



public class MethodOverridingEx {

    static void paint(Shape p){
        p.draw();
    }
    public static void main(String[] args)
    {
        Line2 line = new Line2();
        paint(line);

        paint(new Shape());
        paint(new Line2());
        paint(new Reat());
        paint(new Circle());



    }


}
