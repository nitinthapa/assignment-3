import java.util.Scanner;
class Lar No
{
public static void main(String args[])
{
int x,y,z;
Scanner sc= new Scanner(System.in);
x= sc.nextInt();
y= sc.nextInt();
z= sc.nextInt();
if(x>=y && x>=z)
{
System.out.println("x is largest");
}
else if(y>=x && y>=z)
{
System.out.println("y is largest");
}
else 
{
System.out.println("z is largest");
}
}
}
