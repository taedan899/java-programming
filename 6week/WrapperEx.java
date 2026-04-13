public class WrapperEx {
    
    public static void main(String[] args)
    {
        System.out.println(Character.toLowerCase('A'));
        char c1='4',c2='F';
        if(Character.isDigit(c1))
            System.out.println(c1 + "는 숫자");

        System.out.println(Integer.parseInt("28"));
        System.out.println(Integer.toString(28));

        Integer i = Integer.valueOf(28);
        System.out.println(i.doubleValue());

        Double d = Double.valueOf(3.14);
        System.out.println(d.toString());

        boolean b = (4 > 3);
        System.out.println(Boolean.toString(b));

    }


}
