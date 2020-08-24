package codevita;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SingleLaneHighway {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.######");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int speed[] = new int[n];
		  for(int i=0;i<n;i++)
		    speed[i] = sc.nextInt();

		  if (n == 0 || n == 1)
		  {
			System.out.println(df.format(n)); 
		  } else {
			  double per = 1,group = 0;
			  
			  for(int i=1; i<=n; i++)
			  {
			    per *= i;

			    for(int j=1,mult =1 ;j<=i; mult *= ++j )
			    {
			      group += (per/mult);
			    }

			  }
			  
			  if (n%2 == 0)
			    group--;

			  group -=n;
			  System.out.println(df.format(group/per)); 
		  }

		 
		  sc.close();
	}

}


