package classes;

/**
 *
 * @author Arthur, Pedro Vitor and Eduardo
 */
public class Locacao {
    
    private int codLocacao;
    private String dataInicio;
    private String dataFinal;
    private int codigoCliente;
    private Veiculo veiculo;
    
    public Locacao(int codLocacao, String dataInicio, String dataFinal, int codigoCliente, Veiculo veiculo) {
        this.codLocacao = codLocacao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.codigoCliente = codigoCliente;
        this.veiculo = veiculo;
    }
    
    public Locacao() {
		
    }

    public int getCodLocacao() {
        return codLocacao;
    }

    public void setCodLocacao(int codLocacao) {
        this.codLocacao = codLocacao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
