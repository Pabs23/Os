interface calculation{
void add(int[]a);
void average(int[]a);
default void display()
{
System.out.println("The Add is");
}
static void print()
{
System.out.println("hello");
}
class Demmo implements calculation
{
void add(int[]a)
{
int sum=0;
java.util.Scanner s1=new java.util.Scanner(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=s1.nextInt();
sum=sum+a[i];
}
System.out.println(sum);
}
}

public void avergae(int[]a)
{

{
int sum=0;
java.util.Scanner s1=new java.util.Scanner;
for(int i=0;i<a.length;i++)
{
a[i]=s1.nextInt();
sum=sum+a[i];
System.ou.println(a.length);
}
}
Class Test
{
public static void main(String arr[])
{ java.util.Scanner s1=new java.util.Scanner(System.in);
int n=s1.nextInt90;
int[a]=new int[int[n];

	calculation c=new demo();
	c.add(a);
	c.average(a);
	c.display();
	calculation.print()
}
}
