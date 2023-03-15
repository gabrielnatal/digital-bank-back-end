package digtal.bank.api.entities;


import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;


@Table(name = "users")
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    private int telefone;
    private String senha;
    private String email;
    private int balance;



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public User(int id, String nome,int telefone, String senha, String email, int balance) {
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














}
