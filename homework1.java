import java.util.*;
public class homework1 {
    static public void main(String[] args) {
	    int i = new Random().nextInt(2000);
	    System.out.println(i);
        int n=0;
        int z= i;
        while (z > 0){ z >>= 1; n++;}
        System.out.println(n);

        int k=0;
        for (int x = i; x < Short.MAX_VALUE; x++)
		{if (x % n ==0) k=k+1;
        }
        System.out.println(k);
        int[] m1 = new int[k]; 
        k=0;
        for (int x = i; x < Short.MAX_VALUE; x++)
        {
		if (x % n ==0) {
           m1[k]=x;
           
           k=k+1;
            }
        }
        System.out.println(m1[0]);
        System.out.println(m1[1]);
        System.out.println(m1[2]);
        
        
        
        int l=0;
        for (int y = i; y > Short.MIN_VALUE; y--)
		{if (y % n ==0) l=l+1;
        }
        System.out.println(l);
        int[] m2 = new int[l]; 
        l=0;
        for (int y = i; y > Short.MIN_VALUE; y--)
        {
		if (y % n ==0) {
           m2[l]=y;
           
           l=l+1;
            }
        }
        System.out.println(m2[0]);
        System.out.println(m2[1]);
        System.out.println(m2[2]);
    }	
}
