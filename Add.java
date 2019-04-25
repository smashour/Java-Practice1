import java.util.Scanner;

public class Add {
    public static void addition(){
        Scanner in = new Scanner(System.in);
        int sum = 0, i, n;
        System.out.println("enter number");

        while((n = in.nextInt())!=0){
            if(n>0)
            {
                sum = sum + n;
            }

            else
            {
                System.out.println("error");
            }
        }
        System.out.printf("%d", sum);


    }
    public static void main(String[] args) {
        addition();
    }
}
