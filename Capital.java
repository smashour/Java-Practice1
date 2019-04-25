import java.util.Scanner;

public class Capital {
    public static void letter(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter character");
        String a;
        a=in.nextLine();
        char ch=a.charAt(0);
        if(Character.isUpperCase(ch)) //to check Capital letter
        {
            System.out.println("Capital letter");
        }
        else if(Character.isLowerCase(ch))  //to check Smallletter
        {
            System.out.println("Small letter");
        }
        else if(Character.isDigit(ch))      //to check Digit
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("symbol");   //to check Special symbols
        }
    }
    public static void main(String[] args) {
        letter();

    }
}
