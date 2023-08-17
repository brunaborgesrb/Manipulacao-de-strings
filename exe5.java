/*Implemente um programa para solicitar ao usuário que digite uma
sequência de caracteres representando o CPF de uma pessoa. O CPF digitado
deve ter exatamente 11 caracteres e esses caracteres devem ser
obrigatoriamente dígitos numéricos. Enquanto o CPF digitado pelo usuário não
obedecer às regras acima definidas, o programa deve emitir uma mensagem
informando que o CPF digitado não é válido e solicitar que o usuário digite
novamente. Quando o CPF digitado for válido, o programa deverá exibi-lo no
seguinte formato: XXX.XXX.XXX-XX */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

           String cpf;
           boolean valido = false;
           do {
               System.out.print("informe um cpf: ");
               cpf = input.nextLine();
               valido = validarCPF(cpf);
               if (!valido) {
                   System.out.println("o CPF digitado não é válido. Tente novamente.");
               }
           } while (!valido);

           exibirCPF(cpf);
       }

       public static boolean validarCPF(String cpf) {
           if (cpf.length() != 11) {
               return false;
           }
           for (int i = 0; i < cpf.length(); i++) {
               char digito = cpf.charAt(i);
               if (!Character.isDigit(digito)) {
                   return false;
               }
           }
           return true;
       }

       public static void exibirCPF(String cpf) {
           String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
           System.out.println(cpfFormatado);
      
   }

   }

