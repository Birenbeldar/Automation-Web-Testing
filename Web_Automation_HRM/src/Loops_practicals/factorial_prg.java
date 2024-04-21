package Loops_practicals;

import java.util.Scanner;

public class factorial_prg {
    public static void main(String[] args) {
        System.out.println("Please enter the value to find out the factorial of it");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();

        // using while loop

        /*int i = 1;
       long ans = 1 ;
        while (i<=user_input){
            ans = ans * i;
            i++;
        }
        System.out.println(ans);
    */
        //using for loop

        int ans = 1;
        for (int i = 1;i<=user_input;i++){
            ans = ans * i ;
            System.out.println(ans);
        }
    }
}

