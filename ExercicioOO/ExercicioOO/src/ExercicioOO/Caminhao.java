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
    public void abastecer() {
        if (status == true) {
            if (gasolina <= 100) {
                gasolina = gasolina + 10;
                preco -= 25;
                System.out.println("Com o abastecimento sua gasolina ficou: " + gasolina + "e diminiu 5 reais pelo abastecimento ficando com" + preco);
            } else {
                System.out.println("Seu combustivel ja está no máximo !!");
            }
        } else {
            System.out.println("Ligue o veiculo primeiro para abastecer!");
        }
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Cor: " + this.getCor());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Numero de Rodas: " + this.getNumeroDeRodas());
        System.out.println("Gasolina: " + this.getGasolina());
    }
}
