import java.util.Scanner;

public class Palindrome {


    public static void palind() {
        Scanner in = new Scanner(System.in); //Scanner
        System.out.println("enter num");
        int n = in.nextInt();  //inputing number


        int reverse = 0, sum = 0, x, y;
        int num = n; //assigning number to another variable
        while (n != 0) {
            x = n % 10;
            reverse = reverse * 10 + x;
            n = n / 10;
        }
        if (reverse == num) {
            do {
                y = num % 10;
                if ((y % 2) == 0) //finding wheather digit is even or not
                {
                    sum = sum + y;
                }
                num = num / 10;
            } while (num != 0);
            System.out.printf("no is palindrome and sum of even numbers is %d", sum);
        } else {
            System.out.printf("not palindrome");
        }

    }

    public static void main(String[] args) {
        palind();
    }

}

