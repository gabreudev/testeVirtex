package com.virtex.testeVirtex.Controllers;

import com.virtex.testeVirtex.Entities.ONU;
import com.virtex.testeVirtex.Servicies.ONUService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ONUController {
 private final ONUService service;

 public ResponseEntity<List<ONU>> listarONU(){
     List<ONU> lista = service.listarONU();

     return ResponseEntity.ok(lista);
 }
    public ResponseEntity cadastrarONU(){
        service.cadastrarOnus();

        return ResponseEntity.ok().build();
    }
}
