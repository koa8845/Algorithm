import java.util.Scanner;
public class Score {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Scorem =");
    int Scorem = scanner.nextInt();
     System.out.print("Scoref =");
    int Scoref = scanner.nextInt();
     int TTScoref = Scoref+Scorem;
    if (TTScoref > 50){
         System.out.print("คะแนนร่วมของคุณ");
         System.out.println("ผ่าน");
         } else {
        System.out.print("คะแนนร่วมของคุณ");
        System.out.println("ไม่ผ่าน");
    }
}
}