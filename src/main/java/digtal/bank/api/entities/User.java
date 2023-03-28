package digtal.bank.api.entities;


import digtal.bank.api.dto.DadosAtualizarUser;
import digtal.bank.api.dto.DadosCadastroUser;
import jakarta.persistence.*;


@Table(name = "users")
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private int telefone;
    private String senha;
    private String email;
    private int balance;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public User() {
    }

    public User(Long id, String nome,int telefone, String senha, String email, int balance) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
        this.email = email;
        this.balance = balance;

    }

    public User(DadosCadastroUser dados) {
    this.nome = dados.nome();
    this.senha = dados.senha();
    this.email = dados.email();
    this.telefone= dados.telefone();
    this.balance=dados.balance();

    }


    public void atualizarInformaçoes(DadosAtualizarUser dados) {
       if (dados.nome() != null){
           this.nome = dados.nome();
       }
        if (dados.email() != null){
        this.email = dados.email();
        }


    }
}
