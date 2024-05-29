package com.sanduicheiche.venda.api.converter;


import com.sanduicheiche.venda.api.request.LancheRequestDTO;
import com.sanduicheiche.venda.infrastructure.entity.LancheEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class LancheConverter {


    public LancheEntity paraLancheEntity(LancheRequestDTO lancheDTO) {
        return LancheEntity.builder()
                .id(UUID.randomUUID().toString())
                .nome(lancheDTO.getNome())
                .valor(lancheDTO.getValor())
                .build();
                //.item(lancheDTO.getEmail());

    }

}
