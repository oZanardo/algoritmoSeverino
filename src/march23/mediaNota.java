package march23;

import java.util.Scanner;

public class mediaNota {
    static void main(String[] args) {
        //var exercicios 1
        Scanner sogra = new Scanner(System.in);
        float nota1,nota2,nota3,media;
        //Exercicio 1
        System.out.println("Leia tres numeros inteiros e imprima a media aritmetica entre esses numeros");
        System.out.print("Nota 1: ");
        nota1 = sogra.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = sogra.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = sogra.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A media das notas: %.2f", media);


    }

}
