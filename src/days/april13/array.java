package days.april13;
import java.util.Scanner;

public class array {

    static void main() {

        int[] numero = new int[10];
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < numero.length; i++){
            System.out.print("Digite um numero : ");
            numero[i] = sc.nextInt();
        }

        System.out.println("LISTA DE NUMEROS MAIORES QUE 5 :");

        for (int i = 0; i < numero.length; i++){
            if (numero[i]>5) System.out.print(numero[i] + ", ");
        }
        System.out.println();

    }

}
