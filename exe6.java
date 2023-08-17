/*Implemente um programa para solicitar ao usuário que informe o
código de um produto. Após a digitação do código pelo usuário, o programa
deverá checar se o código informado é válido. Para tal, implemente uma função
que recebe como entrada um código de produto e retorna 1, 2 ou 3:
Retorna 1, se o código for válido;
Retorna 2, se o código digitado tiver uma quantidade inválida de caracteres. Um
código de produto deve ter obrigatoriamente nove caracteres;
Retorna 3, se o código digitado não estiver no formato esperado. Um código de
produto deve ser formado por quatro letras (maiúsculas ou minúsculas) seguidas
de cinco dígitos numéricos. A primeira letra deve ser obrigatoriamente ‘a’
(maiúsculo ou minúsculo). Por exemplo: abcd23456
Ao final, o programa (main) deverá exibir se o código fornecido pelo usuário é ou
não válido. Ao exibir uma mensagem de código inválido, o programa deve informar
o motivo da invalidez. */

import java.util.Scanner;
public class ContarCaracteres1 {
    public static int valida (String cod) {
        int tam = cod.length(), i;
        char car;
        if (tam != 9) {
            return 2;
        }
        else { // tamanho é correto
            if (cod.charAt(0) != 'A' && cod.charAt(0) != 'a') {
                return 3; // formado inválido
            }
            else { // primeiro caracter é 'A', 'a'
                for (i = 1; i <= 3; i++) {
                    car = cod.charAt(i);
                    if (Character.isLetter(car) == false) {
                        return 3; // formado inválido
                    }
                }
                for (i = 4; i <= 8; i++) {
                    car = cod.charAt(i);
                    if (Character.isDigit(car) == false) {
                        return 3;  // formado inválido
                    }                    
                }
                return 1; // código válido
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String codigo;
        int retorno;
        System.out.print("Informe o código do produto: ");
        codigo = in.next();
        retorno = valida (codigo);
        if (retorno == 1) {
            System.out.println("O código " + codigo + " é válido!");
        }
        else if (retorno == 2) {
            System.out.println("O código " + codigo + "não é válido: qtd. de caracteres inválida!");
        }
        else {
            System.out.println("O código " + codigo + "não é válido: formato inválido!");
        }
    }
}
