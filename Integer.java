import java.util.Scanner;

public class Integer {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int num=in.nextInt();
        if((num%2)==0 && (num>20)&&(num<30)) //to check even numbers between 20 and 30
        {
            System.out.println("Jerry");
        }
        else if((num%2)!=0&&(num>20)&&(num<30)) //to check odd numbers between 20 and 30
        {
            System.out.println("tom");
        }
        else {
            System.out.println("error");
        }
    }
}
