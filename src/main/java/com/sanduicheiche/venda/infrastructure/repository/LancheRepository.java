package com.sanduicheiche.venda.infrastructure.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sanduicheiche.venda.infrastructure.entity.LancheEntity;

public interface LancheRepository extends MongoRepository<LancheEntity, String>{
}
