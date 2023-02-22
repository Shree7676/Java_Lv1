import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

// A palindrome is a word, number, phrase, or other sequences of characters that reads the same
// backward as forward, such as madam or racecar. Arunima got a new puppy (pet) and she wants to
// decide the name for her pet. The name of the pet should be a palindrome. Write a program to
// take the pet name as input and print "true" if it is palindrome or print "false" on screen.
// Help Arunima to decide the name ( should be palindrome ) of the puppy.
// Hint: reverse the name and compare it with the original name.


public class a {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the name to check palindrome or not");
        String data=sc.nextLine();
        if (data==data.substring(data.length()-1,0)){
            System.out.println("Palindrome");
        }
    }
}
