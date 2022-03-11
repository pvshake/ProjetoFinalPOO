package classes;
/**
 *
 * @author Arthur, Pedro Vitor and Eduardo
 */
public abstract class Pessoa {
    
    protected String rg;
    protected String cpf;
    protected String nome;
    
    public Pessoa(String rg, String cpf, String nome){
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public Pessoa(){
        
    }
    
}
