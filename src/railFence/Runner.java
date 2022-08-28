package railFence;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Text: ");
		String plainText = in.nextLine();
		
		System.out.print("Enter the key: ");
		int key = in.nextInt();
		
		encryption(plainText, key);
	}
	static String encryption(String text, int key) {
		String encryptedText = "";
		
		boolean check = false;
		int j = 0;
		int row = key;
		int col = text.length();
		char[][] a = new char[row][col];
		
		for (int i = 0; i < col; i++) {
			if(j == 0 || j == key -1)
				check = !check;
			
			a[j][i] = text.charAt(i); //add charcters to matrix
			if(check)
				j++;
			else
				j--;
		}
		for (int i = 0; 1 < row; i++) {
			for(int k = 0; k < col; k++) {
				if(a[ ])	
			}
		}
		for (int i = 0; 1 < row; i++) {
			for(int k = 0; k < col; k++) {
				System.out.print(a[i][k] + "");
			}
			System.out.println();
		}
		return encryptedText;
	}
}


