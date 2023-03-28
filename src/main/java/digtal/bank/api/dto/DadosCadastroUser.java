package digtal.bank.api.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUser(
      @NotBlank  String nome,
       @NotBlank String senha,

        int balance,

        int telefone,
        @NotBlank String email ) {
}
