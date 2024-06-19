package co.com.alianza.microservicio.useCase;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudConsultaCliente;
import co.com.alianza.microservicio.model.cliente.repository.ConsultaClienteRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.Objects;

@RequiredArgsConstructor
public class BuscarClientesUseCase {

  private final ConsultaClienteRepository repository;

  public Flux<Cliente> ejecutar(SolicitudConsultaCliente solicitud) {
    Flux<Cliente> clientes = repository.buscarPorFiltro(solicitud);
    if (Objects.isNull(solicitud.getSharedKey()) || solicitud.getSharedKey().isBlank()) {
      return clientes;
    } else {
      return clientes.filter(cliente -> cliente.getSharedKey().equalsIgnoreCase(solicitud.getSharedKey()));
    }
  }

}
