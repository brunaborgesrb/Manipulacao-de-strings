/*Implemente um programa para solicitar ao usuário que digite uma
frase. O programa deverá calcular e exibir a quantidade de vogais da frase
digitada. */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String frase;
        int tam;

           System.out.print("informe uma frase: ");
           frase = input.nextLine();

           int numVogais = 0;
           tam = frase.length();
           
           for (int i = 0; i < tam-1; i++) {
               char letra = Character.toLowerCase(frase.charAt(i));
               if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                   numVogais++;
               }
           }

               System.out.println("a frase informada possui" + numVogais + "vogais");
       
      
   }

   }

