import java.util.Scanner;

class OddNumbersInRightAngle{
 public static void main(String[] args){
       
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
short row=sc.nextShort();

int num=1;
for(int i=1;i<=row;i++){
   for(int j=1;j<=i;j++){ 
	     while(true){
			 if(num%2!=0)
		 {
	     System.out.print(" "+num); 
		 num++;
		 break;
		 }
		 else
			 num++;
		 }	 
   }
    System.out.println();
}







}
}