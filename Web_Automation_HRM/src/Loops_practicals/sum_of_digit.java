package Loops_practicals;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        System.out.println("Please enter the number below -:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // using while loop

        int i = 1;
        int ans = 0 ;
        while(i<=number){
            ans = ans + i;
            i++;
        }
        System.out.println(ans);
    }
}
