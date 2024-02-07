import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Enter A :" + A);
        System.out.println("Enter B :" + B);
        int  C =  A + B;
        System.out.println("Answer :" +C);
        sc.close();
    }
}
