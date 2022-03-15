package br.com.dio.desafios.iniciais;

import java.util.Scanner;

/*
O jogo de xadrez possui várias peças com movimentos curiosos:
uma delas é a dama, que pode se mover qualquer quantidade de
casas na mesma linha, na mesma coluna, ou em uma das duas diagonais,
conforme exemplifica a figura abaixo:

O grande mestre de xadrez Kary Gasparov inventou um novo tipo de
problema de xadrez: dada a posição de uma dama em um tabuleiro de
xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos
movimentos, no mínimo, ela precisa para chegar em outra casa do tabuleiro?

Kary achou a solução para alguns desses problemas, mas teve dificuldade
outros, e por isso pediu que você escrevesse um programa que resolve
esse tipo de problema.

Entrada
A entrada contém vários casos de teste.
A primeira e única linha de cada caso de teste contém quatro
inteiros X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8).
A dama começa na casa de coordenadas (X1, Y1), e a casa de destino é a casa de
coordenadas(X2, Y2).
No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e
as linhas de cima para baixo também de 1 a 8. As coordenadas de uma casa na
linha X e coluna Y são (X, Y ).

O final da entrada é indicado por uma linha contendo quatro zeros.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única
linha na saída, contendo um número inteiro, indicando o menor número de
movimentos necessários para a dama chegar em sua casa de destino.

Exemplo de Entrada	 Exemplo de Saída
4 4 6 2               1
3 5 3 5               0
5 5 4 3               2
0 0 0 0

 */
public class D3_Dama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        /*
        Resposta:
        ----------------------------------
        8| 81  82  83  84  85  86  87  88 |
        ----------------------------------
        7| 71  72  73 {74} 75  76  77  78 |
        ----------------------------------
        6| 61  62 (63) 64 {65} 66  67  68 | (x1)+{y2} == (y1)+{x2} -> 6+4 == 3+7 Diagonal Direita Esquerda = 1 movimento
        ----------------------------------
        5| 51 {52} 53  54  55 (56) 57  58 | (x1 + Y2) == {x2+y2} -> 5+6 == 4+7 Diagonal Esquerta Direita = 1 movimento
        ----------------------------------
        4| 41  42  43({44})45  46 {47} 48 | (x1)=={x2} && (y1)=={y2} mesma posição = 0 movimento
        ----------------------------------
        3| 31  32 {3} (34) {3} 36  {7} 38 | (x1) == {x2} ->  3 == 3 Horizotal = 1 movimento
        ----------------------------------
        2| 21  22  23  24  25  26 (27) 28 | (y1) == {y2} ->  7 == 7 Vertical = 1 movimento
        ----------------------------------
        1| 11  12  13  14  15  16  {7} 18 |
        ----------------------------------
        1   2   3   4   5   6   7   8
        */

        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true)   {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if (x1 == x2 && y1 == y2) // esta na mesma casa
                System.out.println("0");
            else if ((x1 + y1 == x2 + y2)||(x1 + y2 == y1 + x2))// move pela diagonas
                System.out.println("1");
            else if ((x1 == x2) || (y1 == y2)) // move pela horizontal ou vertical
                System.out.println("1");
            else // dois movimentos para qualquer outra casa
                System.out.println("2");
        }
        sc.close();
    }
}
