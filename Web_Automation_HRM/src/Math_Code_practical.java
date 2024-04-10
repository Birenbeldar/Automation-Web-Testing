import java.util.Scanner;

public class Math_Code_practical {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter the Value of x =: ");
        double x = sc.nextDouble();
        System.out.println("please Enter the Value of y =: ");
        double y = sc.nextDouble();
        System.out.println("please Enter the Value of z =: ");
        double z = sc.nextDouble();

        double result = 0;

        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();
    }
}
