/*Implemente um programa para solicitar ao usuário que digite uma frase. O
programa deverá inverter a frase a frase e exibir a nova frase obtida. */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Solicita ao usuário que digite uma frase
        System.out.print("informe uma frase: ");
        String frase = input.nextLine();
        // Inverte a frase
        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse();
        // Exibe a nova frase obtida
        System.out.println("frase invertida: " + fraseInvertida.toString());
    }
}


