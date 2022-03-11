package classes;

public class ExceptionCriada extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ExceptionCriada(String texto){
		super(texto);
	}
}
