import java.util.Scanner;
public class Sort{
    public static void check(){
        int a[];
        a = new int[20];
        int i = 0, count = 0, j, x, k;
        int sum = 0;
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number != 0)  //to find number of digits in number
        {
            a[i] = number % 10;
            number = number / 10;
            i = i + 1;
            count = count + 1;
        }
        for (k = 0; k < count - 1; k++) //sorting digits in a number
        {
            for (j = 0; j < count - k - 1; j++)
            {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        for (x = 0; x < count; x++) //to check for even digits
        {
            System.out.print(a[x]);
            if (a[x] % 2 == 0) {
                sum = sum + a[x];
            }
        }
        System.out.println("");

        if (sum > 15)
        {
            System.out.println("true");
        } else
            {
            System.out.println("false");
        }


    }
    public static void main(String[] args) {
       check();
    }
}