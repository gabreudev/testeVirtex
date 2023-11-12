package com.virtex.testeVirtex.Controllers;

import com.virtex.testeVirtex.Entities.ONU;
import com.virtex.testeVirtex.Servicies.ONUService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ONU")
public class ONUController {
 private final ONUService service;

 @Operation(description = "lista as onus cadastradas no banco")
 @GetMapping("/")
 public ResponseEntity<List<ONU>> listarONU(){
     List<ONU> lista = service.listarONU();

     return ResponseEntity.ok(lista);
 }
 @Operation(description = "lê os dados do arquivo estático e cadastra no banco de dados")
 @PostMapping("/")
 public ResponseEntity cadastrarONU(){
     service.cadastrarOnus();

     return ResponseEntity.ok().build();
    }
}
