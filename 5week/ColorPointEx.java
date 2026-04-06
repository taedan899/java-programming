class Point{
    private int x,y;
    public void set(int x,int y){
        this.x = x; this.y = y;

    }
    public void ShowPoint(){
        System.out.println("(" + x + "," + y + ")");
    }

}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void ShowColorPoint(){
        System.out.print(color);
        ShowPoint();
    }
}


public class ColorPointEx {
    
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.ShowPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.ShowColorPoint();
    }
}
