package listaEstatica;

public class Eletrodomesticos {
    public String Marca;
    public int voltagem;
    public double preco;

    public Eletrodomesticos(String marca, int voltagem, double preco) {
        Marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
