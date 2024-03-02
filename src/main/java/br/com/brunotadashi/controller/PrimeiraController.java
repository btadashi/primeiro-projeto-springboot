package br.com.brunotadashi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

  @GetMapping("/metodoComResponseEntity/{id}")
  public ResponseEntity<Object> metodoComResponseEntity(@PathVariable Long id) {
    var usuario = new Usuario("brunotadashi");

    if (id > 5) {
      return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    return ResponseEntity.badRequest().body("Número menor que 5");
  }

  record Usuario(String username) {
  }
}
