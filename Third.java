import java.util.*;
public class Third
{
public static void main(String[] str)
{
int no;
String name;
float height;
long sal;

Scanner scan = new Scanner(System.in);
System.out.print("Enter no. ");
no=scan.nextInt();
System.out.print("Enter name: ");
name=scan.next();
System.out.print("Enter height and salary: ");
height=scan.nextFloat();
sal=scan.nextLong();

System.out.print("\n No = "+no);
System.out.print("\n Name = "+name+"\n Height = "+height);
System.out.print("\n Salary = "+sal);
} }