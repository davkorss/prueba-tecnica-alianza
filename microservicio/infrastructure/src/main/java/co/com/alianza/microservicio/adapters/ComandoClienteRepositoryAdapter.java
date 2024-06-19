package co.com.alianza.microservicio.adapters;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudComandoCliente;
import co.com.alianza.microservicio.model.cliente.repository.ComandoClienteRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class ComandoClienteRepositoryAdapter implements ComandoClienteRepository {

  @Override
  public Mono<Cliente> guardar(SolicitudComandoCliente solicitud) {
    return Mono.just(Cliente.builder().sharedKey(solicitud.getSharedKey()).build());
  }

}
