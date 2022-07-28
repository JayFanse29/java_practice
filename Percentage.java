import java.util.*;
public class Percentage
{
public static void main(String[] s)
{
int m1,m2,m3;
float per;

Scanner scan = new Scanner(System.in);
System.out.print("Enter marks in 3 subjects: ");
m1=scan.nextInt();
m2=scan.nextInt();
m3=scan.nextInt();

per=(float)(m1+m2+m3)/3;
System.out.print("The percentage: "+per);
}}
 