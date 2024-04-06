import java.util.*;
import java.util.Scanner;

public class Switch_case_practical_2 {
    public static void main (String[]args){
        System.out.println("This is the practical of the switch case finding characters from the word and look if it's vowel or consonunt");
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Please type word below--------");
        String word = sc.nextLine();
        int wcount = word.length();
        System.out.println("your word count is "+wcount+" .");
        System.out.println("Enter character number (1 to"+wcount+"). or press 0 to exit the program");
        int charNumber = sc.nextInt();
        if (charNumber >= 1 && charNumber <= wcount){
            char selectedChar = word.charAt(charNumber - 1);
        switch (selectedChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The Character '"+selectedChar+"' is vowel.");
                break;
            default:
                    if(Character.isLetter(selectedChar)){
                        System.out.println("The Character '"+selectedChar+"' is Consonant.");
                    }else if(Character.isDigit(selectedChar)){
                        System.out.println("The Character '"+selectedChar+"' is number.");
                    } else if (selectedChar == ' ') {
                        System.out.println("The Character '"+selectedChar+"' is Space.");
                    } else{
                        System.out.println("The Character '"+selectedChar+"' is not number or Letter.");
                    }
         }
        }else if(charNumber == 0){
            System.out.println("Exiting the program");
        }else {
            System.out.println("Invalid character number entered");
        }
        sc.close();

    }

}
