package days.march30;
import java.util.Scanner;

public class nota {
    static void main(String[] args) {
        Scanner john = new Scanner(System.in);
        int qNotas = 3;
        int nota[] = new int[qNotas+1];
        int total=0;


        for (int i = 0; i<qNotas; i++){
            System.out.printf("Digite a nota "+ (i+1) +" :");
            nota[i] = john.nextInt();
            total += nota[i];
        }
        nota[qNotas] = total/qNotas;
        if(nota[qNotas] >= 60 ) System.out.println("aprovado!!");
        else if(nota[qNotas] <= 40) System.out.println("Reprovadissimo");
        else System.out.println("Quem passa direto é trem");

//        System.out.println(nota[qNotas]);

    }
}
