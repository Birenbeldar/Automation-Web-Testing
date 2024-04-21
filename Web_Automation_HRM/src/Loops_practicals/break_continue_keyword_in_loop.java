package Loops_practicals;

import java.sql.SQLOutput;

public class break_continue_keyword_in_loop {
    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i%2 == 0){
                break;
            }
        }*/
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (i == 5)continue;{
                System.out.println("**After");
            }
        }
    }
}
