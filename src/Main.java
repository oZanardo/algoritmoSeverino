import java.util.*;

public class Main{
    public static void main(String[] args){

        //var exercicios 1
        Scanner sogra = new Scanner(System.in);
        int nota1,nota2,nota3,media;

        //var exercicios 2
        int bornYear,actualYear,ageA,ageB;

        //Exercicio 1
        System.out.println("Leia tres numeros inteiros e imprima a media aritmetica entre esses numeros");
        System.out.print("Nota 1: ");
        nota1 = sogra.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sogra.nextInt();
        System.out.print("Nota 3: ");
        nota3 = sogra.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media das notas: " + media);

        //Exercicio 2 : Faça um programa que receba o ano de nascimento de uma pessoa, o
        //ano atual e imprima:
        System.out.print("Digite o ano do nascimento : ");
        bornYear = sogra.nextInt();
        System.out.print("Qual o ano atual : ");
        actualYear = sogra.nextInt();
        ageA = actualYear - bornYear;
        ageB = 2050 - bornYear;
        System.out.println("Voce tem atualmente : " + ageA +" anos");
        System.out.println("Em 2025 voce vai ter : " + ageB +" anos");

        //Exercicio 3 : Faça um programa que receba a cotação do dólar em reais, e um valor
        //que o usuário possui em dólares. Imprima este valor em reais.


        //Exercicio 4 : Faça um programa que calcule e mostre a área de um losango AREA =
        //(DIAGONAL MAIOR * DIAGONAL MENOR)/2

    }
}