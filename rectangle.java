import java.util.Scanner;
public class Rectangle implements shape {
   private double length;
   private double width;
   public Rectangle() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the length of the rectangle: ");
       length = scanner.nextDouble();
       System.out.print("Enter the width of the rectangle: ");
       width = scanner.nextDouble();
   }
   @Override
   public double getArea() {
       return length * width;
   }
   @Override
   public double getPerimeter() {
       return 2 * (length + width);
   }
}
