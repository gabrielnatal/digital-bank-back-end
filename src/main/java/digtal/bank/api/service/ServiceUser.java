package digtal.bank.api.service;

import digtal.bank.api.dto.DadosAtualizarUser;
import digtal.bank.api.dto.DadosCadastroUser;
import digtal.bank.api.dto.DadosListagemUser;
import digtal.bank.api.entities.User;
import digtal.bank.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class ServiceUser {
    @Autowired
    private UserRepository repository;

    public void salvarUsuario(DadosCadastroUser dados){
        repository.save(new User(dados));
    }

    public List<DadosListagemUser> listarUsuario(){
        return repository.findAll().stream().map(digtal.bank.api.dto.DadosListagemUser::new).toList();
    }

    public void atualizarUser(DadosAtualizarUser dados){
        var user = repository.getReferenceById(dados.id());
        user.atualizarInformaçoes(dados);

    }

    public void excluirUser(Long id){
        repository.deleteById(id);
    }


}
