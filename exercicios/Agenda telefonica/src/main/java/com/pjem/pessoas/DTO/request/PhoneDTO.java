package com.pjem.pessoas.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneDTO {

    private int id_phone;

   // @Enumerated(EnumType.STRING)
    private String type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String numero;

}
