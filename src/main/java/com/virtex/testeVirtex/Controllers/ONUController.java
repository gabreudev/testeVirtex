package com.virtex.testeVirtex.Controllers;

import com.virtex.testeVirtex.Entities.ONU;
import com.virtex.testeVirtex.Servicies.ONUService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/ONU")
public class ONUController {
 private final ONUService service;

 @GetMapping
 public ResponseEntity<List<ONU>> listarONU(){
     List<ONU> lista = service.listarONU();

     return ResponseEntity.ok(lista);
 }
 @PostMapping
 public ResponseEntity cadastrarONU(){
     service.cadastrarOnus();

     return ResponseEntity.ok().build();
    }
}
