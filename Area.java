import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius :");
        double Radius = sc.nextDouble();
        double areaOfCircle = 3.14 * Radius *Radius;
        double volumeOfCircle = 1.3333 *Radius *Radius*Radius;
        System.out.println("Area of Circle :" + areaOfCircle);
        System.out.println("Volume of Circle :"+volumeOfCircle);

        System.out.print("Enter the Side :");
        double Side = sc.nextDouble();
        double areaOfSquare = Side* Side;
        double volumeOfSquare = Side* Side * Side;
        System.out.println("Area of Square :" + areaOfSquare);
        System.out.println("Volume of Square :"+volumeOfSquare);
        sc.close();
    }
}
