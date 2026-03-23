class Printer{
    char endChar;
    Printer(char endAlphabet)
    {
        this.endChar = endAlphabet;

    }
    void useWhile(char startAlphabet)
    {
        char startChar = startAlphabet;
        while (startChar < this.endChar)
        {
            System.out.print(startChar++);
        }

        System.out.println();
    }

    void useDoWhile(char startAlphabet)
    {
        char startChar = startAlphabet;
        do {
            System.out.print(startChar++);

        }while(startChar < this.endChar);
        System.out.println();
    }
}



public class Main {
    public static void main(String[] args)
    {
        Printer normal = new Printer('C');
        normal.useWhile('d');
        normal.useDoWhile('d');

    }
    
}
