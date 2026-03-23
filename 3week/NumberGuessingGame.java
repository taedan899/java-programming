import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame {
    
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int geuss = 0;
        int attempts = 0;

        System.out.println("숫자 맞추기 게임을 시작합니다!");
        
        System.out.println("1부터 100사이의 숫자를 맞춰보세요.");

        while ( geuss != targetNumber)
        {
            System.out.print("숫자를 입력하세요: ");
            geuss = userInput.nextInt();
            attempts++;
            
            if (geuss > targetNumber){
                System.out.println("더작은 숫자를 입력하세요");

            }
            else if (geuss < targetNumber)
            {
                System.out.println("더 큰 숫자를 입력하시오:");

            }
            else { 
                System.out.println("정답입니다 총"+ attempts + "번 만에 맞추셨네요.");
            }

            



        }

        userInput.close();

    }


}
