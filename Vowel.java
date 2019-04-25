import java.util.Scanner;

public class Vowel {
 public static void alphabet(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter ");
        String str = in.nextLine();
         for (int i = 0;i<str.length(); i++) //passing through characters
         {
            char c=str.charAt(i);
            if (str.charAt(i) == 'a'||str.charAt(i) =='A'||str.charAt(i) =='E'||str.charAt(i) =='I'||str.charAt(i) =='O'||str.charAt(i) =='U'||str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u')
            {
                 System.out.print("vowel ");
            }
            else if(Character.isDigit(c))  //to check for digits
             {
                System.out.print("error ");
             }
            else
             {
                System.out.print("consonant "); //checking for consonants
             }
        }

    }

    public static void main(String[] args) {
     alphabet();

    }
}
