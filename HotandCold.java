import java.util.Scanner;
public class HotandCold {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("ente Temperature in celsius : ");
int celsius =sc.nextInt();
if (celsius > 35){
    System.out.print("Temperature  "+celsius+"C");{
    System.out.println("status: Hot");}
}else if (celsius > 20){
    System.out.print("Temperature  "+celsius+"C");{
    System.out.println("status: Normal");}
}else if (celsius < 20){
System.out.print("Temperature  "+celsius+"C");{
    System.out.println("status: Cold"); }   
}
}
     }