import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Eg- MOM, 313 , DAD , 212, i.e the reverse should be same

        System.out.println("Enter the Palindrome:");
        Scanner s1 = new Scanner(System.in);
        String sentence = s1.nextLine();
        sentence = sentence.replace("", "");

        String reverse = "";
        for(int i = sentence.length()-1; i>=0; i--){
            reverse += sentence.charAt(i);
            System.out.println(reverse);
        }
        boolean palidrome =true;
        for (int i =0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != reverse.charAt(i)) ;
            {


            }
        }

        if (palidrome){
            System.out.println("PALINDROME!");
        }else {
            System.out.println("Not a Plindrome");
        }

    }
}
