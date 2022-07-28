import java.util.*;
public class Tax
{
public static void main(String[] st)
{
long sal;
double tax;

Scanner scan = new Scanner(System.in);
System.out.print("Enter salary: ");
sal=scan.nextLong();
tax=0.1*sal;

System.out.print("The tax to be paid: "+tax);
}}
