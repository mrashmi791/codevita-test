package codevita;

import java.util.Scanner;

public class LargestGoldInGot {

	public static void main(String[] args) {

		int i, j, k;
		
		long mod = 1000000007;
		
		Scanner sc = new Scanner(System.in);
		
		int vol, maxVol = 0, sum = 0;
		int n = sc.nextInt();
		
		int len[] = new int[n];
		
		int b = sc.nextInt();
		int h = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			len[i] = sc.nextInt();
			sum += len[i];
		}
		
		for (i = 0; i < n; i++) {
			
			int x = 1;
			k = i + 1;
			j = i - 1;
			
			while (j >= 0 && len[j] > len[i]) {
				j--;
				x++;
			}
			
			while (k < n && len[k] > len[i]) {
				k++;
				x++;
			}
			
			vol = x * len[i];
			if (vol > maxVol)
				maxVol = vol;
			else
				maxVol = maxVol;
				maxVol = b * h * maxVol;
				sum = sum * b * h;
				sum = (sum % ((int)Math.pow(10, 9))+7);
				maxVol = (maxVol % ((int)Math.pow(10, 9))+7);
			
		}
		
		System.out.println("sum="+sum);
		System.out.println("maxVal="+maxVol);
		
		System.out.println(((sum % (((int)Math.pow(10, 9))+7)) - (maxVol % ((int)Math.pow(10, 9))+7)) % ((int)Math.pow(10, 9))+7);	
	}

}
