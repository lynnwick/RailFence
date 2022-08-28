# RailFence
Rail Fence cipher In the rail fence cipher, the given plaintext is inputted by the user and a numeric Key entered to the rail fence algorithm. 
The zigzag cipher as its also knew as it written downwards diagonally on successive "rails" of an imaginary fence, then moving 
up when the bottom rail is reached, down again when the top rail is reached, and so on until the whole plaintext is written out. T
he ciphertext is then read off in rows.

see example below: output from the console

	Enter the plain text : Meet at the wall at dawn the battle begins
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
	Decrypted text is : Meet at the wall at dawn the battle begins
