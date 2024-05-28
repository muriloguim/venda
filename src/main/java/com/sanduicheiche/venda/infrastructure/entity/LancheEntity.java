package com.sanduicheiche.venda.infrastructure.entity;

import lombok.*;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "lanche_entity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LancheEntity {

    @Id
    private String id;
    private String nomeLanche;
    private String valorLanche;
    private List<String> item;

    
}
