import java.util.Scanner;
class hello3{
public static void main(String args[])
{
int a;
float b;
String s;
Scanner in=new Scanner(System.in);
System.out.println("enter an integer");
a=in.nextInt();
System.out.println("you've entered "+a);

System.out.println("enter a float");
b=in.nextFloat();
System.out.println("you've entered float"+b);

System.out.print("enter a string ");
s=in.nextLine();
System.out.println("you've entered string"+s);
}
}