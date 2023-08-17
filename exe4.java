/*Implemente um programa para solicitar ao usuário que digite um
nome. Um nome, para ser válido, deve conter apenas letras e espaços. Enquanto
o nome digitado pelo usuário contiver caracteres que não sejam letras nem
espaços, o programa deve emitir uma mensagem informando que o nome digitado
não é válido e solicitar que o usuário digite novamente. */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

           String nome;
           boolean valido = false;
           do {
               System.out.print("informe um nome:");
               nome = input.nextLine();
               valido = validarNome(nome);
               if (!valido) {
                   System.out.println("o nome informado nao é valido. tente novamente");
               }
           } while (!valido);

           System.out.println ("olá " + nome + "prazer em te conhecer!");
       }

       public static boolean validarNome(String nome) {
           for (int i = 0; i < nome.length(); i++) {
               char letra = nome.charAt(i);
               if (!Character.isLetter(letra) && letra != ' ') {
                   return false;
               }
           }
           return true;
       
      
   }

   }
