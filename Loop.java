import java.util.Scanner;

public class Loop {
    public static void array(){
        Scanner in = new Scanner(System.in);
        int i,j;
        System.out.println("enter");
        int n=in.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.printf("%d",i);
            }
        }
    }

    public static void main(String[] args) {

            array();


    }
}