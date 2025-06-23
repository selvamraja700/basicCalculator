// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class calculatorTask {
   public calculatorTask() {
   }

   public static double add(double var0, double var2) {
      return var0 + var2;
   }

   public static double subtract(double var0, double var2) {
      return var0 - var2;
   }

   public static double multiply(double var0, double var2) {
      return var0 * var2;
   }

   public static double divide(double var0, double var2) {
      if (var2 == 0.0) {
         System.out.println(" Error: Cannot divide by zero.");
         return 0.0;
      } else {
         return var0 / var2;
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      boolean var2 = true;
      System.out.println("ðŸ“Ÿ Welcome to Raj's Simple Calculator");

      while(var2) {
         System.out.println("\nChoose an operation:");
         System.out.println("1  Addition");
         System.out.println("2  Subtraction");
         System.out.println("3  Multiplication");
         System.out.println("4  Division");
         System.out.println("5  Exit");
         System.out.print("Enter your choice: ");
         int var3 = var1.nextInt();
         if (var3 == 5) {
            System.out.println(" Exiting calculator. Thank you!");
            break;
         }

         System.out.print("Enter first number: ");
         double var4 = var1.nextDouble();
         System.out.print("Enter second number: ");
         double var6 = var1.nextDouble();
         double var8 = 0.0;
         switch (var3) {
            case 1:
               var8 = add(var4, var6);
               System.out.println("Result: " + var8);
               break;
            case 2:
               var8 = subtract(var4, var6);
               System.out.println("Result: " + var8);
               break;
            case 3:
               var8 = multiply(var4, var6);
               System.out.println("Result: " + var8);
               break;
            case 4:
               var8 = divide(var4, var6);
               System.out.println("Result: " + var8);
               break;
            default:
               System.out.println(" Invalid choice. Please try again.");
         }
      }

      var1.close();
   }
}
