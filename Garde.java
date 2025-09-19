import java.util.Scanner;
public class Garde {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("student Name : ");
 String Name=sc.nextLine(); ;
System.out.print("score : ");
int score =sc.nextInt();
if (score < 0){
    System.out.println("wrong answer");
}else if (score > 100){
    System.out.println("wrong answer");
}
else if (score > 80){
    System.out.print("Gade = A");
    }else if (score > 70){
        System.out.print("Gade = B");
    }else if (score > 60){
        System.out.print("Gade = C");
    }else if (score > 50){
        System.out.print("Gade =D");
    }else {
        System.out.print("Gade E");
    }
}
     }