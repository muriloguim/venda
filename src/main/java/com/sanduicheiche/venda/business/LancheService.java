package com.sanduicheiche.venda.business;

import com.sanduicheiche.venda.api.converter.LancheConverter;
import com.sanduicheiche.venda.api.converter.LancheMapper;
import com.sanduicheiche.venda.api.request.LancheRequestDTO;
import com.sanduicheiche.venda.api.response.LancheResponseDTO;
import com.sanduicheiche.venda.infrastructure.entity.LancheEntity;
import com.sanduicheiche.venda.infrastructure.exceptions.BusinessException;
import com.sanduicheiche.venda.infrastructure.repository.LancheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class LancheService {

    private final LancheRepository lancheRepository;
    private final LancheConverter lancheConverter;
    private final LancheMapper lancheMapper;

    public LancheEntity salvaLanche(LancheEntity lancheEntity) {
        return lancheRepository.save(lancheEntity);
    }

    public LancheResponseDTO gravarLanche(LancheRequestDTO lancheRequestDTO) {
        try {
            notNull(lancheRequestDTO, "Os dados do lache são obrigatórios");
            LancheEntity lancheEntity = salvaLanche(lancheConverter.paraLancheEntity(lancheRequestDTO));
            return lancheMapper.paraLancheResponseDTO(lancheEntity);
        } catch (Exception e) {
            throw new BusinessException("Erro ao gravar dados do lanche", e);
        }
    }


    // public LancheResponseDTO buscaDadosUsuario(String email) {
    //     try {
    //         UsuarioEntity entity = usuarioRepository.findByEmail(email);
    //         notNull(entity, "Usuário não encontrado");
    //         EnderecoEntity enderecoEntity = enderecoService.findByUsuarioId(entity.getId());

    //         return usuarioMapper.paraUsuarioResponseDTO(entity, enderecoEntity);
    //     } catch (Exception e) {
    //         throw new BusinessException("Erro ao buscar dados de usuário", e);
    //     }
    // }

    // @Transactional
    // public void deletaDadosUsuario(String email) {
    //     UsuarioEntity entity = usuarioRepository.findByEmail(email);
    //     usuarioRepository.deleteByEmail(email);
    //     enderecoService.deleteByUsuarioId(entity.getId());

    // }


}
