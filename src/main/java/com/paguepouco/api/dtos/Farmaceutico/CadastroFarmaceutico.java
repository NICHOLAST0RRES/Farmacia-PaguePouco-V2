package com.paguepouco.api.dtos.Farmaceutico;

import com.paguepouco.api.model.Especialidade;
import jakarta.validation.constraints.NotBlank;


public record CadastroFarmaceutico(@NotBlank(message = "ERRO, O NOME DO FARMACEUTICO NÃO PODE SER CADASTRADO EM BRANCO !!!") String nome,
                                   @NotBlank(message = "ERRO, O TIPO DO FARMACEUTICO NÃO PODE SER CADASTRADO EM BRANCO !!!") String tipo,
                                   @NotBlank(message = "ERRO, O CRF DO FARMACEUTICO NÃO PODE SER CADASTRADO EM BRANCO !!!") String crf ,
                                    Especialidade especialidade ,
                                   @NotBlank(message = "ERRO, O TURNO DO FARMACEUTICO NÃO PODE SER CADASTRADO EM BRANCO !!!") String turno) {
}
