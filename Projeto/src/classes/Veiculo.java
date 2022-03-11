package classes;
/**
 *
 * @author Arthur, Pedro Vitor and Eduardo
 */
public class Veiculo {
    
    private String placa;
    private int ano;
    private String marca;
    private String modelo;
    private Double preco;
    
    public Veiculo(String placa, int ano, Double preco, String marca, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.preco = preco;
        this.modelo = marca;
        this.marca = modelo;
    }
    
    public Veiculo() {
		
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
