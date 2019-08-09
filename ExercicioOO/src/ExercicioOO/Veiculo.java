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
public abstract class Veiculo {

    protected float preco;
    protected boolean status = false;
    protected int gasolina = 100;

    public Veiculo(float preco, boolean status) {
        this.preco = preco;
        this.status = status;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    void ligado() {
        if (status == true) {
            System.out.println("Veiculo Ligado");
        } else {
            this.setStatus(true);
            System.out.println("Veiculo estava Desligado, mas agora se encontra LIGADO");
        }
    }

    void desligado() {
        if (status == false) {
            System.out.println("Veiculo Desligado");
        } else {
            this.setStatus(false);
            System.out.println("Veiculo estava Ligado, mas agora se encontra DESLIGADO");
        }
    }

    void abastecer() {
        if (status == true) {
            if (gasolina < 100) {
                gasolina = gasolina + 10;
                preco = preco - 15;
                System.out.println("Com o abastecimento sua gasolina ficou: " + gasolina + "e diminiu 15 reais pelo abastecimento ficando com" + preco);
            } else {
                System.out.println("Seu combustivel ja está no máximo !!");
            }
        }
    }

    void acelerar() {
        if (status == true) {

            if (gasolina <= 0) {
                System.out.println("Sua gasolina esta zerada, Abasteça para acelerar !!");
            } else {
                gasolina = gasolina - 10;
                System.out.println("Com a aceleração sua gasolina diminuiu esta: " + gasolina);
            }
        }
    }

    void trocarPneu() {
        if (status == true) {
            System.out.println("Desligue para trocar o Pneu !!");
        } else {
            System.out.println("Pneu trocado com exito");
        }
    }

    public void mostrarStatus() {
        System.out.println("Preco: " + this.preco);
        System.out.println("Gasolina: " + this.gasolina);
        System.out.println("Status: " + this.status);
    }
}
