import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.nextLine();
        System.out.print("Enter the password :");
        int a = sc.nextInt();
        System.out.println("The String "+str);
        System.out.println("The Password "+a);
        sc.close();
    }
}
