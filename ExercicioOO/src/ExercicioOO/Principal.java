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

                    do {
                        switch (opcao2) {
                            case 1:
                                Moto moto1 = new Moto(7500f, false);
                                moto1.ligado();
                                break;
                            case 2:
                                Moto moto2 = new Moto(7500f, false);
                                moto2.desligado();
                                break;
                            case 3:
                                Moto moto3 = new Moto(7500f, false);
                                moto3.abastecer();
                                break;
                            case 4:
                                Moto moto4 = new Moto(7500f, false);
                                moto4.acelerar();
                                break;
                            case 5:
                                Moto moto5 = new Moto(7500f, false);
                                moto5.trocarPneu();
                                break;
                            case 6:
                                Moto moto6 = new Moto(7500f, false);
                                //moto6.trocarPneu();
                                moto6.mostrarStatus();
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

                    do {
                        switch (opcao3) {
                            case 1:
                                Carro carro1 = new Carro(15000f, false);
                                carro1.ligado();
                                break;
                            case 2:
                                Carro carro2 = new Carro(15000f, false);
                                carro2.desligado();
                                break;
                            case 3:
                                Carro carro3 = new Carro(15000f, false);
                                carro3.abastecer();
                                break;
                            case 4:
                                Carro carro4 = new Carro(15000f, false);
                                carro4.acelerar();
                                break;
                            case 5:
                                Carro carro5 = new Carro(15000f, false);
                                carro5.trocarPneu();
                                break;
                            case 6:
                                Carro carro6 = new Carro(15000f, false);
                                carro6.trocarPneu();
                                carro6.mostrarStatus();
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

                    do {
                        switch (opcao4) {
                            case 1:
                                Caminhao caminhao1 = new Caminhao(100000f, false);
                                caminhao1.ligado();
                                break;
                            case 2:
                                Caminhao caminhao2 = new Caminhao(100000f, false);
                                caminhao2.desligado();
                                break;
                            case 3:
                                Caminhao caminhao3 = new Caminhao(100000f, false);
                                caminhao3.abastecer();
                                break;
                            case 4:
                                Caminhao caminhao4 = new Caminhao(100000f, false);
                                caminhao4.acelerar();
                                break;
                            case 5:
                                Caminhao caminhao5 = new Caminhao(100000f, false);
                                caminhao5.trocarPneu();
                                break;
                            case 6:
                                Caminhao caminhao6 = new Caminhao(100000f, false);
                                caminhao6.trocarPneu();
                                caminhao6.mostrarStatus();
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
