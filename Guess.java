import java.util.Scanner;

public class Guess {
    public static void number(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();
        System.out.println("enter limit"); //input how many times one can guess
        int l = in.nextInt();
        for (int i = 1; i <= l; i++)
        {
            System.out.println("Guess");
            int g = in.nextInt();
            if (n == g)  //if guessed number matches input number
            {
                System.out.println("correct");
                break;
            }
            else
                {
                System.out.println("wrong guess");
            }
        }

    }
    public static void main(String[] args) {
      number();

    }
}
