/* Implemente um programa para solicitar ao usuário que digite uma
frase e um caractere qualquer. O programa deve calcular e exibir a quantidade de
vezes que o caractere aparece na frase digitada */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        char [] letras; 
        int tam; 
        System.out.println("Informe seu nome:" );
        nome = input.nextLine();
        tam = nome.length(); //função que diz qual o tamanho da string 
        System.out.print(nome + " tem " + tam + " caracteres");
    }
}	
