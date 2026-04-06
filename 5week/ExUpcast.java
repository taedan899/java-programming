class Line{
    protected int x;
    public Line(int x){
        this.x = x;
    }
    public void show() {
        System.out.println("길이 ( " + x + " ) 선");
    }
}

class ColorLine extends Line{
    private String color;
    public ColorLine(int x, String color) {
        super(x);
        this.color = color;

    }
    public void show() {
        System.out.println("길이 " + x + "인 " + color + "선");

    }
}

class DottedLine extends Line {
    public DottedLine(int x){
        super(x);
    }
    public void show() { 
        System.out.println("길이가 " + x + "인 점선");
    }
}


public class ExUpcast {
    
    public static void main(String[] arg) {
        Line [] p = new Line[2];

        p[0]  = new ColorLine(3, "Red");
        p[1] = new  DottedLine(5);

        p[0].show();
        p[1].show();
    }
}
