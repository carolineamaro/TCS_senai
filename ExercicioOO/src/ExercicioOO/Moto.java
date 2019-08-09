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
public class Moto extends Veiculo implements VeiculoInterface {

    private String cor;
    private int numeroDeRodas;
    private String placa;
    private String modelo;
    
    public Moto(float preco, boolean status) {
        super(preco, status);
        this.cor = "Preto";
        this.numeroDeRodas = 2;
        this.placa = "MMM0000";
        this.modelo = "sei la";
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
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
        if (status == true) {
            if (gasolina <= 100) {
                gasolina = gasolina + 10;
                preco = preco - 5;
                System.out.println("Com o abastecimento sua gasolina ficou: " + gasolina + "e diminiu 5 reais pelo abastecimento ficando com" + preco);
            } else {
                System.out.println("Seu combustivel ja está no máximo !!");
            }
        } else {
            System.out.println("Ligue o veiculo primeiro para abastecer!");
        }
    }

    @Override
    public void acelerar() {
        if (status == true) {
            if (gasolina <= 0) {
                System.out.println("Sua gasolina esta zerada, Abasteça para acelerar !!");
            } else {
                gasolina = gasolina - 5;
                System.out.println("Com a aceleração sua gasolina diminuiu esta: " + gasolina);
            }
        } else {
            System.out.println("Ligue o veiculo primeiro para acelerar!");
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
