package Loops_practicals;

import java.util.Scanner;

public class Multiplication_table_prg {
    public static void main(String[] args) {
        System.out.println("----Welcome to the Multiplication Table---");
        System.out.println("Please Enter the Number of the Table");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        int Ans = 0;
        for (int i = 1; i<=10;i++){
            Ans = userinput * i;
            System.out.println(userinput+" * "+i+" = "+ Ans);
        }
    }
}
