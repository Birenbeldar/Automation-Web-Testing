import java.util.Scanner;

public class Lab_001 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int side_1 = sc.nextInt();
        int side_2 = sc.nextInt();
        int side_3 = sc.nextInt();

        if((side_1 == side_2) && (side_2 == side_3) && (side_1 == side_2)){
            System.out.println("EQ.");
        } else if ((side_1 == side_2) || (side_2 == side_3) || (side_1 == side_3)) {
            System.out.println("ISO");
        }else {
            System.out.println("sclame");
        }
    }
}
