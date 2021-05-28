import java.util.Scanner;

class DownPattern{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
byte row=sc.nextByte();

for(int i=1;i<=row;i++){
   for(int j=1;j<=row;j++){
   
   if(i>=j &&i+j>row)
          System.out.print(i +"" +j+" ");
                      
   else
	      System.out.print("   ");
   }
    System.out.println();
}




}
}