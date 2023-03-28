package digtal.bank.api.dto;

import digtal.bank.api.entities.User;

public record DadosListagemUser(Long id, String nome, String email) {

public DadosListagemUser(User user){
    this(user.getId(),user.getNome(), user.getEmail());
}
}
