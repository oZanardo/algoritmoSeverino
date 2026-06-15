package ExerciciosSEVERINOOO.EstruturaSequencial;

import java.util.*;

public class Main{
    public static void main(String[] args){

        //var exercicios 1
        Scanner sogra = new Scanner(System.in);
        int nota1,nota2,nota3,media;
        //var exercicios 2
        int bornYear,actualYear,ageA,ageB;
        //var exercicios 3
        float dol,brl,exchange;
        //var exercicios 4
        float diagonalA,diagonalB,areaLosango;
        // var exercicios 5
        float celsius, fahrenheit;
        // var exercicios 6
        double coefA, coefB, coefC, delta, r1, r2;
        // var exercicios 7
        float salMin, salFunc, qtdSalMin;
        // var exercicios 8
        int numTabuada;
        // var exercicios 9
        double numPositivo, quadrado, cubo, raizQuadrada, raizCubica;
        // var exercicios 10
        float valorGasto, gorjeta;
        // var exercicios 11
        int numInt, antecessor, sucessor, dobro;
        float metade;
        // var exercicios 12 e 13
        float alturaH, pesoIdealH, pesoIdealM;
        // var exercicios 14
        int varA, varB, varTemp;
        // var exercicios 15
        int totalEleitores, votosC1, votosC2, votosNulos;
        float percC1, percC2, percNulos;

        /*------------------------------MENU------------------------------*/
        System.out.println("Escolha um exericio para checar : \n(Entre 1 e 15)");

        int temp = sogra.nextInt();

        switch (temp) {
            case 1:
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
                break;
            case 2:
                //Exercicio 2 : Faça um programa que receba o ano de nascimento de uma pessoa, o
                //ano atual e imprima:
                System.out.print("Digite o ano do nascimento : ");
                bornYear = sogra.nextInt();
                System.out.print("Qual o ano atual : ");
                actualYear = sogra.nextInt();
                ageA = actualYear - bornYear;
                ageB = 2050 - bornYear;
                System.out.println("Voce tem atualmente : " + ageA + " anos");
                System.out.println("Em 2025 voce vai ter : " + ageB + " anos");
                break;
            case 3:
                //Exercicio 3 : Faça um programa que receba a cotação do dólar em reais, e um valor
                //que o usuário possui em dólares. Imprima este valor em reais.
                System.out.print("Qual a cotação atual do dolar : ");
                dol = sogra.nextFloat();
                System.out.print("Quantos reais voce tem em conta atualmente : ");
                brl = sogra.nextFloat();
                exchange = brl / dol;
                System.out.printf("Voce consegue comprar %.2f dolares com o dinheiro em conta", exchange);
                break;
            case 4:
                //Exercicio 4 : Faça um programa que calcule e mostre a área de um losango AREA =
                //(DIAGONAL MAIOR * DIAGONAL MENOR)/2
                System.out.print("Informe a diagonal maior : ");
                diagonalA = sogra.nextFloat();
                System.out.print("Informe a diagonal menor : ");
                diagonalB = sogra.nextFloat();
                areaLosango = (diagonalA * diagonalB) / 2;
                System.out.printf("A area total do Losango seria %.3f", areaLosango);
                break;
            case 5:
                // Exercicio 5
                System.out.print("Informe a temperatura em Celsius: ");
                celsius = sogra.nextFloat();
                fahrenheit = (celsius * 1.8f) + 32;
                System.out.printf("A temperatura em Fahrenheit e: %.2f F%n", fahrenheit);
                break;

            case 6:
                // Exercicio 6
                System.out.print("Informe o coeficiente a: ");
                coefA = sogra.nextDouble();
                System.out.print("Informe o coeficiente b: ");
                coefB = sogra.nextDouble();
                System.out.print("Informe o coeficiente c: ");
                coefC = sogra.nextDouble();
                delta = (coefB * coefB) - (4 * coefA * coefC);
                r1 = (-coefB + Math.sqrt(delta)) / (2 * coefA);
                r2 = (-coefB - Math.sqrt(delta)) / (2 * coefA);
                System.out.printf("As raizes sao: X1 = %.2f e X2 = %.2f%n", r1, r2);
                break;

            case 7:
                // Exercicio 7
                System.out.print("Informe o valor do salario minimo: ");
                salMin = sogra.nextFloat();
                System.out.print("Informe o salario do funcionario: ");
                salFunc = sogra.nextFloat();
                qtdSalMin = salFunc / salMin;
                System.out.printf("O funcionario ganha %.2f salarios minimos.%n", qtdSalMin);
                break;

            case 8:
                // Exercicio 8
                System.out.print("Digite um numero para ver sua tabuada: ");
                numTabuada = sogra.nextInt();
                System.out.println(numTabuada + " x 1 = " + (numTabuada * 1));
                System.out.println(numTabuada + " x 2 = " + (numTabuada * 2));
                System.out.println(numTabuada + " x 3 = " + (numTabuada * 3));
                System.out.println(numTabuada + " x 4 = " + (numTabuada * 4));
                System.out.println(numTabuada + " x 5 = " + (numTabuada * 5));
                System.out.println(numTabuada + " x 6 = " + (numTabuada * 6));
                System.out.println(numTabuada + " x 7 = " + (numTabuada * 7));
                System.out.println(numTabuada + " x 8 = " + (numTabuada * 8));
                System.out.println(numTabuada + " x 9 = " + (numTabuada * 9));
                System.out.println(numTabuada + " x 10 = " + (numTabuada * 10));
                break;

            case 9:
                // Exercicio 9
                System.out.print("Digite un numero positivo: ");
                numPositivo = sogra.nextDouble();
                quadrado = Math.pow(numPositivo, 2);
                cubo = Math.pow(numPositivo, 3);
                raizQuadrada = Math.sqrt(numPositivo);
                raizCubica = Math.cbrt(numPositivo);
                System.out.printf("Ao quadrado: %.2f%nAo cubo: %.2f%nRaiz Quadrada: %.2f%nRaiz Cubica: %.2f%n", quadrado, cubo, raizQuadrada, raizCubica);
                break;

            case 10:
                // Exercicio 10
                System.out.print("Informe o valor gasto pelo cliente: ");
                valorGasto = sogra.nextFloat();
                gorjeta = valorGasto * 0.10f;
                System.out.printf("O valor da gorjeta do garcom (10%%) e: R$ %.2f%n", gorjeta);
                break;

            case 11:
                // Exercicio 11
                System.out.print("Digite um numero inteiro: ");
                numInt = sogra.nextInt();
                antecessor = numInt - 1;
                sucessor = numInt + 1;
                dobro = numInt * 2;
                metade = numInt / 2.0f;
                System.out.printf("Antecessor: %d | Sucessor: %d | Dobro: %d | Metade: %.1f%n", antecessor, sucessor, dobro, metade);
                break;

            case 12:
                // Exercicio 12
                System.out.print("Informe a altura do homem (em metros): ");
                alturaH = sogra.nextFloat();
                pesoIdealH = (72.7f * alturaH) - 58;
                System.out.printf("O peso ideal para este homem e: %.2f kg%n", pesoIdealH);
                break;

            case 13:
                // Exercicio 13
                System.out.print("Informe a altura da mulher (em metros): ");
                alturaH = sogra.nextFloat();
                pesoIdealM = (62.1f * alturaH) - 44.7f;
                System.out.printf("O peso ideal para esta mulher e: %.2f kg%n", pesoIdealM);
                break;

            case 14:
                // Exercicio 14
                System.out.print("Digite o valor da variavel A: ");
                varA = sogra.nextInt();
                System.out.print("Digite o valor da variavel B: ");
                varB = sogra.nextInt();
                varTemp = varA;
                varA = varB;
                varB = varTemp;
                System.out.printf("Valores invertidos -> A: %d, B: %d%n", varA, varB);
                break;

            case 15:
                // Exercicio 15
                System.out.print("Informe o total de eleitores: ");
                totalEleitores = sogra.nextInt();
                System.out.print("Votos do primeiro candidato: ");
                votosC1 = sogra.nextInt();
                System.out.print("Votos do segundo candidato: ");
                votosC2 = sogra.nextInt();

                votosNulos = totalEleitores - (votosC1 + votosC2);
                percC1 = ((float)votosC1 / totalEleitores) * 100;
                percC2 = ((float)votosC2 / totalEleitores) * 100;
                percNulos = ((float)votosNulos / totalEleitores) * 100;

                System.out.printf("Percentual Candidato 1: %.2f%% %n", percC1);
                System.out.printf("Percentual Candidato 2: %.2f%% %n", percC2);
                System.out.printf("Percentual Votos Nulos: %.2f%% %n", percNulos);
                break;

            default:
                System.out.println("Opcao invalida!");
        }//Switch


        sogra.close();
    }
}