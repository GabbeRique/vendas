package models;

public class Carro extends Veiculo {
    private int quantidadePortas;
    private String tipoCombustivel;
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int quantidadePortas, String tipoCombustivel,  int QtdPassageiros, boolean Seguro) {
        super(marca, modelo, ano, QtdPassageiros, Seguro);
        this.quantidadePortas = quantidadePortas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoCarro = tipoCarro;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

}
