import java.util.*;
public class test {
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
        System.out.println(m1[3]);
        System.out.println(m1[4]);
        System.out.println(m1[5]);
        System.out.println(m1[6]);
    }	
}
