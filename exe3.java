/* Implemente um programa para solicitar ao usuário que digite uma
frase. O programa deve calcular e exibir quantas letras, quantos dígitos numéricos
(‘0’ a ‘9’), quantos espaços em branco e quantos símbolos aparecem na frase.
OBS: Considere que símbolo é tudo que não seja letra, dígito numérico ou espaço
em branco. */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		int tam, letras = 0, digitos = 0, brancos = 0, simbolos = 0;
		char teste;
		System.out.println("digite uma frase qualquer: ");
		frase = input.nextLine();
		tam = frase.length();

		for(int i = 0; i <= tam-1; i++) {
			teste = frase.charAt(i);
			if (Character.isLetter(teste) == true) {
				letras++;
			}
			else if (Character.isDigit(teste) == true) {
				digitos++;
			}
			else if (Character.isSpaceChar(teste) == true) {
				brancos++;
			}
			else {
				simbolos++;
			}

		}
		System.out.println("A frase tem: " + letras + " letras, " + digitos + " digitos, " + 
				brancos + " espaços em branco e " + simbolos + " simbolos");
	}

}
