
class Point {
    private int x, y, z;
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    public String toString(){
        return "Point(" + x + "," + y + "," + z + ")";
    }
}


public class ExString {
    
    public static void main(String[] args)
    {
        Point a = new Point(2,3,8);
        System.out.println(a);

    }
}
 