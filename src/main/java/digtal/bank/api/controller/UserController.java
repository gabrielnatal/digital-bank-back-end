package digtal.bank.api.controller;


import digtal.bank.api.entities.DadosCadastroUser;
import digtal.bank.api.entities.DadosListagemUser;
import digtal.bank.api.entities.User;
import digtal.bank.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/users"})
public class UserController {

    @Autowired
    private UserRepository repository;


    @PostMapping({"/registrar"})
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroUser dados){
        repository.save(new User(dados));
}
    @GetMapping({"/listar"})
    public List<DadosListagemUser>listar(){
    return repository.findAll().stream().map(DadosListagemUser::new).toList();
    }

}
