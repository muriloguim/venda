package com.sanduicheiche.venda.infrastructure.entity;

import lombok.*;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "lanche")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LancheEntity {

    @Id
    private String id;
    private String nome;
    private String valor;
    //private List<String> item;

    
}
