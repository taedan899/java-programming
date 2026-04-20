import java.util.Vector;

public class VectorExExtend {

    public static void main (String[] args) {

        Vector<String> stringV = new Vector<String>();

        stringV.add("I");
        stringV.add("am");
        stringV.add("Groot");

        stringV.add(2,"Little");

        System.out.println("벡터 내의 요소 객체 수 : " + stringV.size());
        System.out.println("벡터의 현재 용량 : "+stringV.capacity());

        for(int i = 0; i < stringV.size(); i++)
        {   
            String string = stringV.get(i);
            System.out.print(string + " ");

        }
    }

}