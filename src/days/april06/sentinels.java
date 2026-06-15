package days.april06;
import java.util.Scanner;

public class sentinels {
    static void main() {

        Scanner sc = new Scanner(System.in);


//MINHA VERSAO        //var
//        Scanner entrada = new Scanner(System.in);
//        int temp = 0;
//        int finalValue = 0;
//        int contador = 0;
//        double mediaFinal;
//        System.out.println("--------------------------------------------------------Digite -5 para sair do programa--------------------------------------------------------");
//        while (temp != -5) {
//
//            System.out.println("Digite um valor : ");
//            temp = entrada.nextInt();
//            if (temp != 5){
//            finalValue += temp;
//            contador++;}
//        }
//        mediaFinal = finalValue/contador;
//        System.out.println("a soma de todos os numeros é igual a "+finalValue);
//        System.out.println("a média é " + mediaFinal);


//variaveis

    int[] num = new int[4];
    int maiorQ, menorQ;

    for(int i =0; i <num.length;i++){
        System.out.print("Digite um numero : ");
        num[i] = sc.nextInt();
    }
    maiorQ = num[0];
    menorQ = num[0];
        for (int i =1;i<num.length;i++){
            if (maiorQ < num[i])maiorQ=num[i];
            else if(menorQ > num[i]) menorQ = num[i];
        }
        System.out.println("O maior numero digitado foi " + maiorQ+" e o menor foi : "+ menorQ);



    }
}