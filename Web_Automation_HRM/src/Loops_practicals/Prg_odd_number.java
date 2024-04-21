package Loops_practicals;
import java.util.*;
public class Prg_odd_number {
    public static void main(String[] args) {
        //print the odd number from 1 to 50
        int Total_odd = 0;
        for (int i = 1; i <= 50; i++) {
            if (!(i % 2 == 1)) {
                System.out.println("The " + i + " is even number");
                 Total_odd = i;
            }
        }
        System.out.println();
        System.out.println("End of Program");
    }
}