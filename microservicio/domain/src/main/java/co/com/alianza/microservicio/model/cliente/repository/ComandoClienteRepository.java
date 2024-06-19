package co.com.alianza.microservicio.model.cliente.repository;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudComandoCliente;
import reactor.core.publisher.Mono;

public interface ComandoClienteRepository {

  Mono<Cliente> guardar(SolicitudComandoCliente solicitudComandoCliente);

}
