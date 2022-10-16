package Day2.SwitchCase;

import java.util.Scanner;

public class VowelOrConsonant {
    static void toCheckAlphabetIsVowelOrConsonant(char ch) {

        switch (ch){
            case 'a':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'e':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'i':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'o':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'u':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'A':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'E':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'I':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'O':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            case 'U':
                System.out.println("Entered Alphabet is a Vowel");
                break;
            default:
                System.out.println("Entered Alphabet is a consonant");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        char ch = sc.next().charAt(0);
        toCheckAlphabetIsVowelOrConsonant(ch);//Method calling

    }
}
