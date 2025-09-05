import java.util.Scanner;
public class po {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number = ");
    int Number = scanner.nextInt();
    if (Number > 0){
        System.out.println("จำนวนเต็มบวก");
        } else {
            System.out.println("ไม่ใช่จำนวนเต็ม");
        }
        System.out.println("จบโปรแกรม");
        }
}