import java.util.Scanner;

class NumbersInRightAngle{
 public static void main(String[] args){
       
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
short row=sc.nextShort();

/*for(int i=1;i<=row;i++){
   for(int j=1;j<=row;j++){ //other than if condition we can give directly in j condition i.e. for(int j=1;j<=i;j++)
	     if(i>=j)
	     System.out.print(i +"" +j+" "); 
		 
		 
   }
    System.out.println();
}*/

int num=1;
for(int i=1;i<=row;i++){
   for(int j=1;j<=i;j++){ 
	     
	     System.out.print(" "+num); 
		 num++;
		 
   }
    System.out.println();
}







}
}