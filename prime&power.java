import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num, i, count=0,power,result=1;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      System.out.print("Enter Power: ");
      power = s.nextInt();
      for(i=2; i<num; i++)
      {
         if(num%i == 0)
         {
            count++;
            break;
         }
      }
      
      if(count==0)
         System.out.println("\nIt is a Prime Number.");
      else
         System.out.println("\nIt is not a Prime Number.");
         
		for(int v=1;v<=power;v++)
		{
		    result = result * num;
		}
		System.out.println("Power of number is " + result );
	}
}
