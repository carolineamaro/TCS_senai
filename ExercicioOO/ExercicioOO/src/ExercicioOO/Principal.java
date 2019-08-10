/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioOO;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("Escolha uma opcao abaixo: ");
        System.out.println("1 - Veiculo Moto");
        System.out.println("2 - Veiculo Carro");
        System.out.println("3 - Veiculo Caminhao");
        System.out.println("0 - Para sair");
        System.out.println("--------------------------------");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        Moto moto = new Moto(3000f, false);
        Carro carro = new Carro(10000f, false);
        Caminhao caminhao = new Caminhao(5000f, false);

        do {
            switch (opcao) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    System.out.println("3 - Abastecer");
                    System.out.println("4 - Acelerar");
                    System.out.println("5 - Trocar Pneu");
                    System.out.println("6 - Mostrar Status do Veiculo");
                    System.out.println("7 - Sair");
                    System.out.println("---------------------------------");

                    Scanner scanner2 = new Scanner(System.in);
                    int opcao2 = scanner.nextInt();

                    //Moto moto = new Moto(3000f, false);

                    do {
                        switch (opcao2) {
                            case 1:
                                moto.ligado();
                                break;
                            case 2:
                                moto.desligado();
                                break;
                            case 3:
                                moto.abastecer();
                                break;
                            case 4:
                                moto.acelerar();
                                break;
                            case 5:
                                moto.trocarPneu();
                                break;
                            case 6:
                                //moto6.trocarPneu();
                                moto.mostrarStatus();
                                break;
                            case 7:
                                System.out.println("Ate logo !!");
                                System.exit(0);
                            default:
                                System.out.println("Opcao nao encontrada !!");
                        }
                    } while (opcao2 == 7);
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    System.out.println("3 - Abastecer");
                    System.out.println("4 - Acelerar");
                    System.out.println("5 - Trocar Pneu");
                    System.out.println("6 - Mostrar Status do Veiculo");
                    System.out.println("7 - Sair");
                    System.out.println("---------------------------------");

                    Scanner scanner3 = new Scanner(System.in);
                    int opcao3 = scanner.nextInt();

                    //Carro carro = new Carro(10000f, false);
                    do {
                        switch (opcao3) {
                            case 1:
                                carro.ligado();
                                break;
                            case 2:
                                carro.desligado();
                                break;
                            case 3:
                                carro.abastecer();
                                break;
                            case 4:
                                carro.acelerar();
                                break;
                            case 5:
                                carro.trocarPneu();
                                break;
                            case 6:
                                carro.mostrarStatus();
                                break;
                            case 7:
                                System.out.println("Ate logo !!");
                                System.exit(0);
                            default:
                                System.out.println("Opcao nao encontrada !!");
                        }
                    } while (opcao == 7);
                    break;
                case 3:
                    System.out.println("---------------------------------");
                    System.out.println("Escolha uma opcao: ");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Desligar");
                    System.out.println("3 - Abastecer");
                    System.out.println("4 - Acelerar");
                    System.out.println("5 - Trocar Pneu");
                    System.out.println("6 - Mostrar Status do Veiculo");
                    System.out.println("7 - Sair");
                    System.out.println("---------------------------------");

                    Scanner scanner4 = new Scanner(System.in);
                    int opcao4 = scanner.nextInt();

                    //Caminhao caminhao = new Caminhao(5000f, false);

                    do {
                        switch (opcao4) {
                            case 1:
                                caminhao.ligado();
                                break;
                            case 2:
                                caminhao.desligado();
                                break;
                            case 3:
                                caminhao.abastecer();
                                break;
                            case 4:
                                caminhao.acelerar();
                                break;
                            case 5:
                                caminhao.trocarPneu();
                                break;
                            case 6:
                                caminhao.mostrarStatus();
                                break;
                            case 7:
                                System.out.println("Ate logo !!");
                                System.exit(0);
                            default:
                                System.out.println("Opcao nao encontrada !!");
                        }
                    } while (opcao == 7);
                    break;
                case 0:
                    System.out.println("Ate logo !!");
                    System.exit(0);
                default:
                    System.out.println("Opcao nao encontrada !!");
            }
        } while (opcao != 0);
    }
}
