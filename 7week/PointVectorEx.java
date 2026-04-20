import java.util.Vector;

class PointVector {
    private int x,y;
    public PointVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")"
    }

}



public class PointVectorEx {
    
    public static void main(String[] args)
    {
        Vector<PointVector> v = new Vector<PointVector>();

        v.add(new PointVector(2, 3));
        v.add(new PointVector(-5, 20));
        v.add(new PointVector(30, -8));

        v.remove(1);

        for(int i = 0; i <v.size(); i++)
        {
            PointVector p = v.get(i);
            System.out.println(p);

        }


    }

}
