package digtal.bank.api.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarUser(@NotNull Long id,
                                 String nome,
                                 String email
                                 ) {


}
