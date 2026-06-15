package ExerciciosSEVERINOOO.EstruturaRepetition;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sogra = new Scanner(System.in);

        // var exercicios 1
        int matricula;
        float nLoop1, nLoop2, nLoop3, medLoop;
        // var exercicios 2
        float salarioHab, somaSalario, totalFilhos;
        int countHab;
        // var exercicios 3
        float valDobro;
        // var exercicios 4
        int limiteImpar;
        // var exercicios 5
        float tempDia, somaTemp;
        // var exercicios 6
        char sexoP;
        float pesoP;
        int mascValidos, femValidas;
        // var exercicios 7
        float notaAl, maiorNota, menorNota;
        // var exercicios 8
        int idadeP, countPeso90;
        float pesoPessoa, somaIdades;

        /*------------------------------MENU------------------------------*/
        System.out.println("Escolha um exercicio de Estrutura de Repeticao para checar: \n(Entre 1 e 8)");
        int temp = sogra.nextInt();

        switch (temp) {
            case 1:
                // Exercicio 1
                System.out.println("Informe os dados do aluno (Matricula negativa para encerrar):");
                while (true) {
                    System.out.print("Matricula: ");
                    matricula = sogra.nextInt();
                    if (matricula < 0) break;

                    System.out.print("Nota 1: ");
                    nLoop1 = sogra.nextFloat();
                    System.out.print("Nota 2: ");
                    nLoop2 = sogra.nextFloat();
                    System.out.print("Nota 3: ");
                    nLoop3 = sogra.nextFloat();

                    medLoop = (nLoop1 + nLoop2 + nLoop3) / 3;
                    if (medLoop >= 70) {
                        System.out.println("Situacao: Aprovado");
                    } else if (medLoop >= 60) {
                        System.out.println("Situacao: Exame");
                    } else {
                        System.out.println("Situacao: Reprovado");
                    }
                }
                break;

            case 2:
                // Exercicio 2
                somaSalario = 0;
                totalFilhos = 0;
                countHab = 0;
                System.out.println("Pesquisa da prefeitura (Salario negativo para encerrar):");
                while (true) {
                    System.out.print("Digite o salario: ");
                    salarioHab = sogra.nextFloat();
                    if (salarioHab < 0) break;

                    System.out.print("Quantidade de filhos: ");
                    totalFilhos += sogra.nextInt();
                    somaSalario += salarioHab;
                    countHab++;
                }
                if (countHab > 0) {
                    System.out.printf("Media salarial da populacao: %.2f%n", (somaSalario / countHab));
                    System.out.printf("Media do numero de filhos: %.1f%n", (totalFilhos / countHab));
                } else {
                    System.out.println("Nenhum dado valido inserido.");
                }
                break;

            case 3:
                // Exercicio 3
                System.out.println("Digite 5 valores para ver o dobro:");
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Valor " + i + ": ");
                    valDobro = sogra.nextFloat();
                    System.out.println("Dobro: " + (valDobro * 2));
                }
                break;

            case 4:
                // Exercicio 4
                System.out.print("Informe um numero limite: ");
                limiteImpar = sogra.nextInt();
                System.out.println("Numeros impares de 1 ate " + limiteImpar + ":");
                for (int i = 1; i <= limiteImpar; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                break;

            case 5:
                // Exercicio 5
                somaTemp = 0;
                System.out.println("Insira as temperaturas dos 10 primeiros dias de Janeiro/2021:");
                for (int i = 1; i <= 10; i++) {
                    System.out.print("Dia " + i + ": ");
                    tempDia = sogra.nextFloat();
                    somaTemp += tempDia;
                }
                System.out.printf("A media das temperaturas e: %.2f C%n", (somaTemp / 10));
                break;

            case 6:
                // Exercicio 6
                mascValidos = 0;
                femValidas = 0;
                System.out.println("Leitura de sexo e peso para 10 pessoas:");
                for (int i = 1; i <= 10; i++) {
                    System.out.print("Pessoa " + i + " - Sexo (M/F): ");
                    sexoP = sogra.next().toUpperCase().charAt(0);
                    System.out.print("Pessoa " + i + " - Peso (kg): ");
                    pesoP = sogra.nextFloat();

                    if (sexoP == 'M' && pesoP >= 60 && pesoP <= 80) {
                        mascValidos++;
                    } else if (sexoP == 'F' && pesoP >= 50 && pesoP <= 70) {
                        femValidas++;
                    }
                }
                System.out.println("Homens entre 60 e 80kg: " + mascValidos);
                System.out.println("Mulheres entre 50 e 70kg: " + femValidas);
                break;

            case 7:
                // Exercicio 7
                maiorNota = Float.MIN_VALUE;
                menorNota = Float.MAX_VALUE;
                System.out.println("Digite as notas de 5 alunos:");
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Nota do aluno " + i + ": ");
                    notaAl = sogra.nextFloat();
                    if (notaAl > maiorNota) maiorNota = notaAl;
                    if (notaAl < menorNota) menorNota = notaAl;
                }
                System.out.println("Maior nota: " + maiorNota);
                System.out.println("Menor nota: " + menorNota);
                break;

            case 8:
                // Exercicio 8
                countPeso90 = 0;
                somaIdades = 0;
                System.out.println("Leitura de dados de sete pessoas:");
                for (int i = 1; i <= 7; i++) {
                    System.out.print("Pessoa " + i + " - Idade: ");
                    idadeP = sogra.nextInt();
                    System.out.print("Pessoa " + i + " - Peso (kg): ");
                    pesoPessoa = sogra.nextFloat();

                    somaIdades += idadeP;
                    if (pesoPessoa > 90) {
                        countPeso90++;
                    }
                }
                System.out.println("Quantidade de pessoas com mais de 90 kg: " + countPeso90);
                System.out.printf("Media das idades das sete pessoas: %.1f anos%n", (somaIdades / 7));
                break;

            default:
                System.out.println("Opcao invalida!");
        }
        sogra.close();
    }
}