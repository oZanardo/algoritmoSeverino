[1mdiff --git a/src/Main.java b/src/Main.java[m
[1mindex 5c7c4c3..3daa719 100644[m
[1m--- a/src/Main.java[m
[1m+++ b/src/Main.java[m
[36m@@ -2,9 +2,42 @@[m [mimport java.util.*;[m
 [m
 public class Main{[m
     public static void main(String[] args){[m
[32m+[m
[32m+[m[32m        //var exercicios 1[m
[32m+[m[32m        Scanner sogra = new Scanner(System.in);[m
[32m+[m[32m        int nota1,nota2,nota3,media;[m
[32m+[m
[32m+[m[32m        //var exercicios 2[m
[32m+[m[32m        int bornYear,actualYear,ageA,ageB;[m
[32m+[m
         //Exercicio 1[m
         System.out.println("Leia tres numeros inteiros e imprima a media aritmetica entre esses numeros");[m
[32m+[m[32m        System.out.print("Nota 1: ");[m
[32m+[m[32m        nota1 = sogra.nextInt();[m
[32m+[m[32m        System.out.print("Nota 2: ");[m
[32m+[m[32m        nota2 = sogra.nextInt();[m
[32m+[m[32m        System.out.print("Nota 3: ");[m
[32m+[m[32m        nota3 = sogra.nextInt();[m
[32m+[m[32m        media = (nota1 + nota2 + nota3) / 3;[m
[32m+[m[32m        System.out.println("A media das notas: " + media);[m
[32m+[m
[32m+[m[32m        //Exercicio 2 : Faça um programa que receba o ano de nascimento de uma pessoa, o[m
[32m+[m[32m        //ano atual e imprima:[m
[32m+[m[32m        System.out.print("Digite o ano do nascimento : ");[m
[32m+[m[32m        bornYear = sogra.nextInt();[m
[32m+[m[32m        System.out.print("Qual o ano atual : ");[m
[32m+[m[32m        actualYear = sogra.nextInt();[m
[32m+[m[32m        ageA = actualYear - bornYear;[m
[32m+[m[32m        ageB = 2050 - bornYear;[m
[32m+[m[32m        System.out.println("Voce tem atualmente : " + ageA +" anos");[m
[32m+[m[32m        System.out.println("Em 2025 voce vai ter : " + ageB +" anos");[m
[32m+[m
[32m+[m[32m        //Exercicio 3 : Faça um programa que receba a cotação do dólar em reais, e um valor[m
[32m+[m[32m        //que o usuário possui em dólares. Imprima este valor em reais.[m
[32m+[m
 [m
[32m+[m[32m        //Exercicio 4 : Faça um programa que calcule e mostre a área de um losango AREA =[m
[32m+[m[32m        //(DIAGONAL MAIOR * DIAGONAL MENOR)/2[m
 [m
     }[m
 }[m
\ No newline at end of file[m
