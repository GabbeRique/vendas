package models;

public class Moto extends Veiculo {
    private String Cor;
    private int NumMotor;
    private String Categoria;

    public Carro(String marca, String modelo, int ano, int quantidadePortas, int QtdPassageiros, boolean Seguro, String Cor, int NumMotor, String Categoria) {
        super(marca, modelo, ano, QtdPassageiros, Seguro);
        this.Cor = Cor;
        this.NumMotor = NumMotor;
        this.Categoria = Categoria;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        this.Cor = cor;
    }
    public int NumMotor(){
        return NumMotor;
    }

    public int getNumMotor() {
        return this.NumMotor;
    }

    public void setNumMotor(int NumMotor) {
        this.NumMotor = NumMotor;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

}