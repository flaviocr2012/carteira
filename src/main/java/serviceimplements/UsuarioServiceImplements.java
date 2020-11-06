package serviceimplements;

import model.Usuario;
import repository.UsuarioRepository;
import service.UsuarioService;
import serviceexception.UsuarioException;

public class UsuarioServiceImplements implements UsuarioService{

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImplements(UsuarioRepository usuarioRepository) {
        super();
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) throws UsuarioException {

        if(usuarioRepository.existsByEmail(email)){
            throw new UsuarioException("Já existe um email cadastrado");
        }

    }
}
