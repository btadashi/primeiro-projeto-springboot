package br.com.brunotadashi.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {

  public String chamarMeuComponent() {
    return "Chamando meu componente";
  }
}
