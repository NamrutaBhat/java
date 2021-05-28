import java.util.Scanner;
 
 class Diamond{
 public static void main(String[] args){
 
 Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
byte b=sc.nextByte();

for(int i=1;i<=b;i++){
   for(int j=1;j<=b;j++){
       if(i-j<=b/2&&j-1<=b/2 && i+j<=b+(b/2)+1 && i+j>=b -(b/2)+1)
	        System.out.print("* ");
			else
			    System.out.print(" ");
				}
	System.out.println();
	
 
 
}
 
 }
 }