import java.util.Scanner;

public class Repeat {

public static void combination(){
    Scanner in = new Scanner(System.in);
    System.out.println("enter string");
    String str = in.nextLine();
    System.out.println("number");
    String s="";
    int n = in.nextInt();
    int length = str.length()-n;
    for (int i = length; i <str.length(); i++)
    {
        {
            s=s+str.charAt(i);
        }

    }



    System.out.printf(str);
    for (int i=1;i<n;i++)
        System.out.printf(s);


}

        public static void main(String[] args) {
           combination();
            }
        }

