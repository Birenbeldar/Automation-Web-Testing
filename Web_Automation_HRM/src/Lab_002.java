import java.util.Scanner;

public class Lab_002 {
    public static void main (String []args){
        System.out.println("Please enter the charecter to identify them if its Vowel or consonunt ");
        Scanner sc = new Scanner(System.in);
        char usr_input = sc.next().toCharArray()[0];

        switch (usr_input) {
            case 'a':
                System.out.println("its a vowel");
                break;
            case 'e':
                System.out.println("its a vowel");
                break;
            case 'i':
                System.out.println("its a vowel");
                break;
            case 'o':
                System.out.println("its a vowel");
                break;
            case 'u':
                System.out.println("its a vowel");
                break;
            default:
                System.out.println("its a consonunt");



        }
    }
}
