/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioOO;

/**
 *
 * @author aluno
 */
public class Caminhao extends Veiculo implements VeiculoInterface {

    private int numeroDeRodas;
    private String cor;
    private String placa;
    private String modelo;

    public Caminhao(float preco, boolean status) {
        super(preco, status);
        this.numeroDeRodas = 4;
        this.cor = "Verde";
        this.placa = "CAM0000";
        this.modelo = "sei la";
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligado() {
        if (status == true) {
            System.out.println("Veiculo Ligado");
        } else {
            this.setStatus(true);
            System.out.println("Veiculo estava Desligado, mas agora se encontra LIGADO");
        }
    }

    @Override
    public void desligado() {
        if (status == false) {
            System.out.println("Veiculo Desligado");
        } else {
            this.setStatus(false);
            System.out.println("Veiculo estava Ligado, mas agora se encontra DESLIGADO");
        }
    }

    @Override
    public void abastecer() {
        if (gasolina < 100) {
            gasolina = gasolina + 10;
            preco = preco - 25;
            System.out.println("Com o abastecimento sua gasolina ficou: " + gasolina + "e diminiu 25 reais pelo abastecimento ficando com" + preco);
        } else {
            System.out.println("Seu combustivel ja está no máximo !!");
        }
    }

    @Override
    public void acelerar() {
        if (gasolina <= 0) {
            System.out.println("Sua gasolina esta zerada, Abasteça para acelerar !!");
        } else {
            gasolina = gasolina - 10;
            System.out.println("Com a aceleração sua gasolina diminuiu esta: " + gasolina);
        }
    }

    @Override
    public void trocarPneu() {
        if (status == true) {
            System.out.println("Desligue para trocar o Pneu !!");
        } else {
            System.out.println("Pneu trocado com exito");
        }
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Cor: " + this.getCor());
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Numero de Rodas: " + this.numeroDeRodas);
        System.out.println("Gasolina: " + this.getGasolina());
        acelerar();
        trocarPneu();
    }
}
