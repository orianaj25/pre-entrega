package exception;

public class contactoNoEncontradoException  extends RuntimeException{
    public contactoNoEncontradoException(String mensagem){
        super(mensagem);
    }
}