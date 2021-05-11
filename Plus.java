class Plus{
public static void main(String[] args){
int row=5;
for(int i=1;i<=row;i++){
  for(int j=1;j<=row;j++){
  if((i==3)||(i==5&&j==3)||(i==1&&j==3)||(i==4&&j==3)||(i==2&&j==3)){
      System.out.print(i +"" +j+" ");
	  }
	   else{
	   System.out.print("   ");
	  }
  }
	  System.out.println();
	  
	  }
}
}