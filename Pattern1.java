import java.util.*;
class Pattern1
{
public static void main(String args[])
{
int i,n,j;
System.out.println("enter a number");
Scanner src=new Scanner(System.in);
n=src.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");

}
System.out.println("");
}
}
}