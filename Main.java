import java.util.*;
public class Main
{
	public static void main(String[] args) 
  {
	 Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   for(int i=a;i>0;i--)
   {
   for (int j=a;j>i;j--){
   System.out.print(j+"  ");}
   for(int j=i;j>0;j--){
   System.out.print(i+"  ");}
   System.out.println(" ");
   }
 }
}
