package march23;

import java.util.Scanner;

public class mediaNota {
    static void main(String[] args) {
        //var exercicios 1
        Scanner sogra = new Scanner(System.in);
        int nota1,nota2,nota3;
        float media;
        //Exercicio 1
        System.out.println("Leia tres numeros inteiros e imprima a media aritmetica entre esses numeros");
        System.out.print("Nota 1: ");
        nota1 = sogra.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sogra.nextInt();
        System.out.print("Nota 3: ");
        nota3 = sogra.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A media das notas: %.2f", media);


    }
}
