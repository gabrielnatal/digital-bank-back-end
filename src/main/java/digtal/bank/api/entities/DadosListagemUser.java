package digtal.bank.api.entities;

public record DadosListagemUser(String nome, String email) {

public DadosListagemUser(User user){
    this(user.getNome(), user.getEmail());
}
}
