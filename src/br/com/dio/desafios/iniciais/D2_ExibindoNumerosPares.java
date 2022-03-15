package br.com.dio.desafios.iniciais;
/*
Desafios
Crie um programa que leia um número e mostre os números pares
até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada,
sendo um em cada linha.


Exemplo de Entrada	 Exemplo de Saída
6	                   2
	                   4
	                   6
 */

//import java.io.IOException;
import java.util.Scanner;

public class D2_ExibindoNumerosPares {
//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro maior que 0: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0)
                    System.out.println(i);
            }

        }
    }
}
