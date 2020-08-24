package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class SecretWord {
	
	public static void secretWord() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String st1 = sc.nextLine();
			String stArr[] = st1.split(" ");
			int chArr1[] = new int[126];
			int chArr2[] = new int[126];
			for(int j = 0; j < stArr[0].length(); j++) {
				chArr1[stArr[0].charAt(j)] = chArr1[stArr[0].charAt(j)] + 1;
				
			}
			for(int j = 0; j < stArr[1].length(); j++) {
				chArr2[stArr[1].charAt(j)] = chArr2[stArr[1].charAt(j)] + 1;
			}
			
			for(int j = 'a'; j < 'z'; j++) {
				if(chArr1[j] > 1) {
					for(int k = 'a'; k < 'z'; k++) {
						if(chArr1[j] == chArr2[k]) {
							System.out.println(chArr2[k] + " "+ (char)k +"  == : "+ (char)j);
						}
					}
					
				}
				
			}
			
			System.out.println("\n\n");
		}
	}

}
