package com.sanduicheiche.venda.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ItensLancheRequestDTO {

    @JsonProperty(required = true)
    private String nome;

}
