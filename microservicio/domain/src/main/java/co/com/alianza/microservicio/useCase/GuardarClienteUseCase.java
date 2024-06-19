package co.com.alianza.microservicio.useCase;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudComandoCliente;
import co.com.alianza.microservicio.model.cliente.repository.ComandoClienteRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GuardarClienteUseCase {

  private final ComandoClienteRepository repository;

  public Mono<Cliente> ejecutar(SolicitudComandoCliente solicitud) {
    return repository.guardar(solicitud);
  }

}
