import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Number =");
           int Number = scanner.nextInt();
            if (Number == 1){
                 int shape = scanner.nextInt();
                 int Triangle = shape*shape;
                 System.out.println("Triangle = ");
            } if (Number == 2) {
                 int weight = scanner.nextInt();
                 int height = scanner.nextInt();
                 int BMI = weight % height
                 System.out.println("BMI = ");
            }
    }
}