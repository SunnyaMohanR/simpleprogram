import java.util.Scanner;
class A
{
 public static void main(String[] arg)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value");
 int a=sc.nextInt();
 System.out.println("The value is= "+a); 

 if (a%4==0 && a%400==0)
  {

   if(a%400==0)
    {
     System.out.println(a+" is not a leap year");
    }
   else
     System.out.println(a+" is a leap year");
  }


 }

}