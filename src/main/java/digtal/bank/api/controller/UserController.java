package digtal.bank.api.controller;


import digtal.bank.api.dto.DadosAtualizarUser;
import digtal.bank.api.dto.DadosCadastroUser;
import digtal.bank.api.dto.DadosListagemUser;
import digtal.bank.api.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/users"})
public class UserController {


    private final ServiceUser serviceUser;
    @Autowired
    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroUser dados){
        serviceUser.salvarUsuario(dados);
}
    @GetMapping
    public List<DadosListagemUser>listar(){
    return serviceUser.listarUsuario();
    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizarUser dados){
       serviceUser.atualizarUser(dados);
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        serviceUser.excluirUser(id);
    }

}
