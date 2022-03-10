package com.pjem.pessoas.DTO.request;

import com.pjem.pessoas.DTO.request.PhoneDTO;
import com.pjem.pessoas.entity.Phone;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private int id_pessoa;

    @NotEmpty
    @Size(min = 3, max = 150)
    private String nome;

    @NotEmpty
    @Size(min = 3, max = 200)
    private String endereco;

    @NotEmpty
    @Size(min = 1, max = 5)
    private int numero;

    @Size(min = 0, max = 50)
    private String complemento;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String bairro;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String cidade;

    @NotEmpty
    @Size(min = 2, max = 2)
    private String uf;

    @NotNull
    private LocalDate aniversario;

    @NotNull
    private LocalDate  cadastro;

    @NotEmpty
    @CPF
    private String cpf;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;

}
