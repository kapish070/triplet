import java.util.*;
public class triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      Float a[]=new Float[size];
      int flag=0;
      float b=0;
      for(int i=0;i<size;i++)
      {
    	  a[i]=sc.nextFloat();
      }
      for(int i=0;i<a.length;i++)
      {
    	  b=b+a[i];
    	  if(b>1 && b<2)
    	  {
    		  flag=1;
    		  break;
    	  }
      }
      System.out.print(flag);
	}

}
