package com.virtex.testeVirtex.Servicies;

import com.virtex.testeVirtex.Entities.ONU;
import com.virtex.testeVirtex.Parser.TextParse;
import com.virtex.testeVirtex.Repositories.ONURepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ONUService {

private final TextParse textParse;
private final ONURepository repository;

public List<ONU> listarONU(){
    List<ONU> lista = repository.findAll();
    return lista;
    }
public void cadastrarOnus(){
    textParse.huaweiReader();
    }
}
