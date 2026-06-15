package days.april20;
import java.util.Scanner;

public class vetores {

static void main() {

    Scanner sc = new Scanner(System.in);
    float[] notas = new float[4];
    String[] alunos = new String[notas.length];
    int pos = 0;

    for(int i = 0; i < notas.length; i++){
        System.out.print("Digite o nome do aluno: ");
        alunos[i] = sc.next();
        System.out.print("Digite a nota do aluno: ");
        notas[i] = sc.nextFloat();
    }

    float maior = notas[0];

    for(int i = 1; i < notas.length; i++){
        if(maior > notas[i]) maior = notas[i]; pos = i;
    }
    System.out.println("Aluno com a maior nota é : " + alunos[pos]);


    }

}