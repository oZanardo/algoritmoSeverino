package ExerciciosSEVERINOOO.EstruturaCondicional;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            Scanner sogra = new Scanner(System.in);

            // var exercicios 1
            int numCond1, numCond2;
            // var exercicios 2 e 3
            float notaCond1, notaCond2, notaCond3, mCond;
            // var exercicios 4
            float ladoX, ladoY, ladoZ;
            // var exercicios 5
            int opSexo;
            float altP, pesoIdealP;
            // var exercicios 6
            float pesoImc, alturaImc, vImc;
            // var exercicios 7
            float salarioAtual, salarioReajustado;
            // var exercicios 8
            int idadeNadador;
            // var exercicios 9
            int idadeEleitor;
            // var exercicios 10 e 11
            int numCalendario;
            // var exercicios 12
            float menuN1, menuN2, resMenu;
            int opMenu;

            /*------------------------------MENU------------------------------*/
            System.out.println("Escolha um exercicio de Estrutura Condicional para checar: \n(Entre 1 e 12)");
            int temp = sogra.nextInt();

            switch (temp) {
                case 1:
                    // Exercicio 1
                    System.out.print("Digite o primeiro numero: ");
                    numCond1 = sogra.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    numCond2 = sogra.nextInt();
                    if (numCond1 == numCond2) {
                        System.out.println("Os dois numeros sao iguais.");
                    } else if (numCond1 > numCond2) {
                        System.out.println("Maior: " + numCond1 + " | Menor: " + numCond2);
                    } else {
                        System.out.println("Maior: " + numCond2 + " | Menor: " + numCond1);
                    }
                    break;

                case 2:
                    // Exercicio 2
                    System.out.print("Nota 1: ");
                    notaCond1 = sogra.nextFloat();
                    System.out.print("Nota 2: ");
                    notaCond2 = sogra.nextFloat();
                    mCond = (notaCond1 + notaCond2) / 2;
                    System.out.printf("Media: %.1f -> ", mCond);
                    if (mCond >= 7) {
                        System.out.println("Aprovado");
                    } else {
                        System.out.println("Reprovado");
                    }
                    break;

                case 3:
                    // Exercicio 3
                    System.out.print("Nota 1: ");
                    notaCond1 = sogra.nextFloat();
                    System.out.print("Nota 2: ");
                    notaCond2 = sogra.nextFloat();
                    System.out.print("Nota 3: ");
                    notaCond3 = sogra.nextFloat();
                    mCond = (notaCond1 + notaCond2 + notaCond3) / 3;
                    System.out.printf("Media: %.1f -> ", mCond);
                    if (mCond >= 0 && mCond < 3) {
                        System.out.println("REPROVADO");
                    } else if (mCond >= 3 && mCond < 7) {
                        System.out.println("EXAME");
                    } else if (mCond >= 7 && mCond <= 10) {
                        System.out.println("APROVADO");
                    }
                    break;

                case 4:
                    // Exercicio 4
                    System.out.print("Lado X: ");
                    ladoX = sogra.nextFloat();
                    System.out.print("Lado Y: ");
                    ladoY = sogra.nextFloat();
                    System.out.print("Lado Z: ");
                    ladoZ = sogra.nextFloat();
                    if ((ladoX < ladoY + ladoZ) && (ladoY < ladoX + ladoZ) && (ladoZ < ladoX + ladoY)) {
                        System.out.println("Os valores informados formam um triangulo.");
                    } else {
                        System.out.println("Os valores NAO podem formar um triangulo.");
                    }
                    break;

                case 5:
                    // Exercicio 5
                    System.out.print("Informe o sexo (1 para Homens, 2 para Mulheres): ");
                    opSexo = sogra.nextInt();
                    System.out.print("Informe a altura (em metros): ");
                    altP = sogra.nextFloat();
                    if (opSexo == 1) {
                        pesoIdealP = (72.7f * altP) - 58;
                        System.out.printf("Peso ideal: %.2f kg%n", pesoIdealP);
                    } else if (opSexo == 2) {
                        pesoIdealP = (62.1f * altP) - 44.7f;
                        System.out.printf("Peso ideal: %.2f kg%n", pesoIdealP);
                    } else {
                        System.out.println("Opcao de sexo invalida.");
                    }
                    break;

                case 6:
                    // Exercicio 6
                    System.out.print("Informe seu peso (kg): ");
                    pesoImc = sogra.nextFloat();
                    System.out.print("Informe sua altura (m): ");
                    alturaImc = sogra.nextFloat();
                    vImc = pesoImc / (alturaImc * alturaImc);
                    System.out.printf("Seu IMC e: %.2f -> ", vImc);
                    if (vImc < 20) {
                        System.out.println("Abaixo do peso");
                    } else if (vImc >= 20 && vImc < 25) {
                        System.out.println("Peso Normal");
                    } else if (vImc >= 25 && vImc < 30) {
                        System.out.println("Sobre Peso");
                    } else if (vImc >= 30 && vImc < 40) {
                        System.out.println("Obeso");
                    } else {
                        System.out.println("Obeso Morbido");
                    }
                    break;

                case 7:
                    // Exercicio 7
                    System.out.print("Informe o salario do funcionario: ");
                    salarioAtual = sogra.nextFloat();
                    if (salarioAtual < 1000.00f) {
                        salarioReajustado = salarioAtual * 1.30f;
                        System.out.printf("Salario reajustado: R$ %.2f%n", salarioReajustado);
                    } else {
                        System.out.println("Funcionario nao possui direito ao aumento.");
                    }
                    break;

                case 8:
                    // Exercicio 8
                    System.out.print("Informe a idade do nadador: ");
                    idadeNadador = sogra.nextInt();
                    if (idadeNadador <= 7) {
                        System.out.println("Categoria: INFANTIL");
                    } else if (idadeNadador <= 10) {
                        System.out.println("Categoria: JUVENIL");
                    } else if (idadeNadador <= 15) {
                        System.out.println("Categoria: ADOLESCENTE");
                    } else if (idadeNadador <= 30) {
                        System.out.println("Categoria: ADULTO");
                    } else {
                        System.out.println("Categoria: SENIOR");
                    }
                    break;

                case 9:
                    // Exercicio 9
                    System.out.print("Informe a idade da pessoa: ");
                    idadeEleitor = sogra.nextInt();
                    if (idadeEleitor < 16) {
                        System.out.println("Classe: Nao eleitor");
                    } else if ((idadeEleitor >= 16 && idadeEleitor < 18) || idadeEleitor >= 65) {
                        System.out.println("Classe: Eleitor facultativo");
                    } else {
                        System.out.println("Classe: Eleitor obrigatorio");
                    }
                    break;

                case 10:
                    // Exercicio 10
                    System.out.print("Digite um numero de 1 a 7 para o dia da semana: ");
                    numCalendario = sogra.nextInt();
                    switch (numCalendario) {
                        case 1: System.out.println("Domingo"); break;
                        case 2: System.out.println("Segunda-feira"); break;
                        case 3: System.out.println("Terca-feira"); break;
                        case 4: System.out.println("Quarta-feira"); break;
                        case 5: System.out.println("Quinta-feira"); break;
                        case 6: System.out.println("Sexta-feira"); break;
                        case 7: System.out.println("Sabado"); break;
                        default: System.out.println("Nao existe dia da semana com esse numero.");
                    }
                    break;

                case 11:
                    // Exercicio 11
                    System.out.print("Digite um numero de 1 a 12 para o mes: ");
                    numCalendario = sogra.nextInt();
                    switch (numCalendario) {
                        case 1: System.out.println("Janeiro"); break;
                        case 2: System.out.println("Fevereiro"); break;
                        case 3: System.out.println("Marco"); break;
                        case 4: System.out.println("Abril"); break;
                        case 5: System.out.println("Maio"); break;
                        case 6: System.out.println("Junho"); break;
                        case 7: System.out.println("Julho"); break;
                        case 8: System.out.println("Agosto"); break;
                        case 9: System.out.println("Setembro"); break;
                        case 10: System.out.println("Outubro"); break;
                        case 11: System.out.println("Novembro"); break;
                        case 12: System.out.println("Dezembro"); break;
                        default: System.out.println("Nao existe mes com este numero.");
                    }
                    break;

                case 12:
                    // Exercicio 12
                    System.out.print("Informe o primeiro numero: ");
                    menuN1 = sogra.nextFloat();
                    System.out.print("Informe o segundo numero: ");
                    menuN2 = sogra.nextFloat();

                    System.out.println("Menu de Opcoes:");
                    System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
                    opMenu = sogra.nextInt();

                    if (opMenu == 1) {
                        resMenu = menuN1 + menuN2;
                        System.out.println("Resultado da soma: " + resMenu);
                    } else if (opMenu == 2) {
                        resMenu = menuN1 - menuN2;
                        System.out.println("Resultado da subtracao: " + resMenu);
                    } else if (opMenu == 3) {
                        resMenu = menuN1 * menuN2;
                        System.out.println("Resultado da multiplicacao: " + resMenu);
                    } else if (opMenu == 4) {
                        if (menuN2 != 0) {
                            resMenu = menuN1 / menuN2;
                            System.out.println("Resultado da divisao: " + resMenu);
                        } else {
                            System.out.println("Erro: Divisao por zero nao permitida.");
                        }
                    } else if (opMenu == 5) {
                        System.out.println("Saindo...");
                    } else {
                        System.out.println("Opcao Invalida.");
                    }
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
            sogra.close();
        }
    }

