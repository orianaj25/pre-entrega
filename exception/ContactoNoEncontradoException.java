package exception;

public class contactoNoEncontradoException  extends RuntimeException{
    public contactoNoEncontradoException(String mensaje){
        super(mensaje);
    }
}