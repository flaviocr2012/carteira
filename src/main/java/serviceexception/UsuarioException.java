package serviceexception;

public class UsuarioException extends RuntimeException {
    public UsuarioException(String mensagem) {
        super(mensagem);
    }
}
