package railFence;
package railfence;

import java.util.Scanner;

/*In the rail fence cipher, the plaintext is written downwards diagonally 
 * on successive "rails" of an imaginary fence, then moving up when the bottom 
 * rail is reached, down again when the top rail is reached, and so on until 
 * the whole plaintext is written out. The ciphertext is then read off in rows.
 * see output on console
 * 
 * 	Enter the plain text : Meet at the wall at dawn the battle begins
	Enter the key : 4
	Rail of encryption : 
	
	M * * * * * t * * * * * w * * * * * t * * * * *   * * * * * a * * * * * b * * * * * 
 	* e * * * a *   * * *   * a * * * a *   * * * n * t * * * b * t * * *   * e * * * s 
 	* * e *   * * * t * e * * * l *   * * * d * w * * * h *   * * * t * e * * * g * n * 
 	* * * t * * * * * h * * * * * l * * * * * a * * * * * e * * * * * l * * * * * i * * 
 	 
	Encrypted text is : Mtwt abea  aa ntbt ese tel dwh tegnthlaeli
	
	Rails for decryption : 
	? * * * * * ? * * * * * ? * * * * * ? * * * * * ? * * * * * ? * * * * * ? * * * * * 
 	* ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? 
 	* * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * * * ? * ? * 
 	* * * ? * * * * * ? * * * * * ? * * * * * ? * * * * * ? * * * * * ? * * * * * ? * * 
	Decrypted text is : Meet at the wall at dawn the battle begins*/

public class RailFence {

	private static String encryption(String plain, int key) {
		String encryptedText = "";
		int col = plain.length();
		int row = key;
		boolean check = false;
		int j = 0;
		char[][] rail = new char[row][col];

		/*
		 * loops row by row through the matrix and adds each character to the cipher
		 * text String to fill the array with '*' (gaps)
		 */
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++)
				rail[i][k] = '*';
		}

		for (int i = 0; i < col; i++) {
			if (j == 0 || j == key - 1)
				check = !check;
			rail[j][i] = plain.charAt(i);

			if (check)
				j++;
			else
				j--;
		}

		System.out.println("Rail of encryption : ");
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				char ch = rail[i][k];
				if (ch != '*')
					encryptedText += rail[i][k];
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		return encryptedText;
	}
	/*
	 * -loops row by row through the matrix and adds each character to the cipher
	 * text String -to fill the array with '*' (gaps) and the text filled the
	 * array'?'
	 */

	private static String decryption(String encrypted, int key) {
		String decryptedText = "";

		int col = encrypted.length();
		int row = key;
		boolean check = false;
		int j = 0;
		char[][] rail = new char[row][col];

		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++)
				rail[i][k] = '*';
		}
		// to fill the array '?':
		for (int i = 0; i < col; i++) {
			if (j == 0 || j == key - 1)
				check = !check;
			rail[j][i] = '?';

			if (check)
				j++;
			else
				j--;
		}
		/*
		 * creates a blank matrix with the parameters of text length and number of rows.
		 */

		System.out.println("Rails for decryption : ");
		int index = 0;
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				char ch = rail[i][k];
				if (ch == '?' && index < col) {
					rail[i][k] = encrypted.charAt(index++);
				}
				System.out.print(ch + " ");
			}
			System.out.println();
		}

		j = 0;
		check = false;
		for (int i = 0; i < col; i++) {
			if (j == 0 || j == key - 1)
				check = !check;
			decryptedText += rail[j][i];

			if (check)
				j++;
			else
				j--;
		}

		return decryptedText;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the plain text : ");
		String pt = sc.nextLine();

		System.out.print("Enter the key : ");
		int key = sc.nextInt();

		String en = encryption(pt, key);
		System.out.println("Encrypted text is : " + en);

		String dn = decryption(en, key);
		System.out.println("Decrypted text is : " + dn);

	}
}



