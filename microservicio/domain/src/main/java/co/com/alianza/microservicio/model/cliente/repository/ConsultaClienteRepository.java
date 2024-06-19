package co.com.alianza.microservicio.model.cliente.repository;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudConsultaCliente;
import reactor.core.publisher.Flux;

public interface ConsultaClienteRepository {

  Flux<Cliente> buscarPorFiltro(SolicitudConsultaCliente solicitudConsultaCliente);

}
