package service;

import model.Usuario;
import serviceexception.UsuarioException;

public interface UsuarioService  {

    Usuario autenticar (String email, String senha);

    Usuario cadastrarUsuario(Usuario usuario);

    void validarEmail(String email) throws UsuarioException;

}
