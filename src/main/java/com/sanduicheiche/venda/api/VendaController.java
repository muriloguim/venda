package com.sanduicheiche.venda.api;


import com.sanduicheiche.venda.api.request.LancheRequestDTO;
import com.sanduicheiche.venda.api.response.LancheResponseDTO;
import com.sanduicheiche.venda.business.LancheService;
import com.sanduicheiche.venda.infrastructure.entity.LancheEntity;

import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lanche")
@RequiredArgsConstructor
public class VendaController {

    private final LancheService lancheService;

    @PostMapping()
    public ResponseEntity<LancheResponseDTO> gravaDadosLanche(@RequestBody LancheRequestDTO lancheRequestDTO) {
        return ResponseEntity.ok(lancheService.gravarLanche(lancheRequestDTO));
    }

    @GetMapping()
    public @ResponseBody Collection<LancheEntity> buscaTodosLanches() {
        return lancheService.listAll();
    }
    

}
