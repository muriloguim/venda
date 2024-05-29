package com.sanduicheiche.venda.api.converter;


import com.sanduicheiche.venda.api.response.LancheResponseDTO;
import com.sanduicheiche.venda.infrastructure.entity.LancheEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LancheMapper {

    @Mapping(target = "id", source = "lanche.id")
    @Mapping(target = "nome", source = "lanche.nome")
    @Mapping(target = "valor", source = "lanche.valor")
    LancheResponseDTO paraLancheResponseDTO(LancheEntity lanche);

}
