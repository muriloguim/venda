package com.sanduicheiche.venda.infrastructure.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "itens_lanche")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItensLancheEntity {

    @Id
    private String id;
    private String nome;
    private String lancheId;

}
