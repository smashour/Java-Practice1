import java.util.Scanner;

public class Reverse {
    public static void invert(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine();
        String s="";
        int length=str.length(); //to find stringlength
        int i;
        for(i=length-1;i>=0;i--)

            s=s+str.charAt(i);
            System.out.printf(s);
    }
    public static void main(String[] args) {

        invert();
    }
}
