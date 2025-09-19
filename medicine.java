import java.util.Scanner;
public class medicine {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
      System.out.print("ente age : ");
int age =sc.nextInt();
if (age > 10){
    System.out.println("Take2 teaspoons");
} else if (age > 3){
 System.out.println("Take1 teaspoons");
} else if (age > 1){
System.out.println("Take1/2 teaspoons");  
} else if (age <= 0){
    System.out.print("wrong answer");
}
else {
    System.out.print("do not take madicine");
}}
}
     