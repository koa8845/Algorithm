import java.util.Scanner;
public class puse {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Number =");
   int Number = scanner.nextInt();
   if (Number%2==0){
    System.out.println("เลขคู่");
   } else {
    System.out.println("เลขคี่");
   }
  }
}