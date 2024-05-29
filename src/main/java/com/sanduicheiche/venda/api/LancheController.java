package com.sanduicheiche.venda.api;


import com.sanduicheiche.venda.api.request.LancheRequestDTO;
import com.sanduicheiche.venda.api.response.LancheResponseDTO;
import com.sanduicheiche.venda.business.LancheService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lanche")
@RequiredArgsConstructor
public class LancheController {

    private final LancheService lancheService;

    @PostMapping()
    public ResponseEntity<LancheResponseDTO> gravaDadosLanche(@RequestBody LancheRequestDTO lancheRequestDTO) {
        return ResponseEntity.ok(lancheService.gravarLanche(lancheRequestDTO));
    }


    // @GetMapping()
    // public ResponseEntity<LancheResponseDTO> buscaUsuarioPorEmail(@RequestParam ("email") String email) {
    //     return ResponseEntity.ok(usuarioService.buscaDadosUsuario(email));
    // }

    // @DeleteMapping
    // public ResponseEntity<Void> deletaDadosUsuario(@RequestParam ("email") String email) {
    //     usuarioService.deletaDadosUsuario(email);
    //     return ResponseEntity.accepted().build();
    // }


}
