import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int A = sc.nextInt();
        System.out.print("Enter B :" );
        int B = sc.nextInt();
        int  C =  A + B;
        System.out.println("Sum Answer :" +C);
        int  D = A*B;
        System.out.print("Product Answer :" +D);
        sc.close();
    }
}
