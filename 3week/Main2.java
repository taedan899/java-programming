class NestedLoop{
    int startNum;
    int endNum;
    public NestedLoop(int startN, int endN)
    {
        this.startNum = startN;
        this.endNum = endN;
    }
    public void printMixedLoops(){
        for (int i = startNum; i <= endNum; i++)
        {
            int j = 1;
            while(j < 10)
            {
                System.out.print(i + "*" + j + "=" + (i*j));
                System.out.print("\t");
                j++;

            }
            System.out.println();
        }

    }

}




public class Main2 {
    public static void main(String[] args)
    {
        NestedLoop oneToNine = new NestedLoop(1, 9);
        oneToNine.printMixedLoops();
    }
}
