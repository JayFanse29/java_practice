import java.util.*;
public class Area
{
public static void main(String[] str)
{
int rad;
float area;
Scanner scan = new Scanner(System.in);
System.out.println("Enter radius: ");
rad=scan.nextInt();
area=3.14f*rad*rad;
System.out.print("The area of circle is: "+area);
}
}
