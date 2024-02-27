package Assignment_5;
import java.util.Scanner;
public class Triangle implements shape {
   private double base;
   private double height;
   private double side1;
   private double side2;
   public Triangle() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the base of the triangle: ");
       base = scanner.nextDouble();
       System.out.print("Enter the height of the triangle: ");
       height = scanner.nextDouble();
       System.out.print("Enter the length of the first side: ");
       side1 = scanner.nextDouble();
       System.out.print("Enter the length of the second side: ");
       side2 = scanner.nextDouble();
   }
   @Override
   public double getArea() {
       return 0.5 * base * height;
   }
   @Override
   public double getPerimeter() {
       return base + side1 + side2;
   }
}


