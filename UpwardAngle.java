import java.util.Scanner;

class UpwardAngle{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int row=sc.nextInt();

for(int i=1;i<=row;i++){
   for(int j=1;j<=row;j++){
	   if(i<=j) 
            System.out.print("* ");	   
	else
		    System.out.print("  ");
                }

           System.out.println();

         }



   }
}