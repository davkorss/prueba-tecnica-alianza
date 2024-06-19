package co.com.alianza.microservicio.adapters;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudConsultaCliente;
import co.com.alianza.microservicio.model.cliente.repository.ConsultaClienteRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public class ConsultaClienteRepositoryAdapter implements ConsultaClienteRepository {

  @Override
  public Flux<Cliente> buscarPorFiltro(SolicitudConsultaCliente solicitudConsultaCliente) {
    List<Cliente> clientes = List.of(
      Cliente.builder().sharedKey("1").businessId("1").email("test.email.1@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("2").businessId("2").email("test.email.2@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("3").businessId("3").email("test.email.3@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("4").businessId("4").email("test.email.4@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("5").businessId("5").email("test.email.5@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("6").businessId("6").email("test.email.6@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("7").businessId("7").email("test.email.7@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("8").businessId("8").email("test.email.8@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("9").businessId("9").email("test.email.9@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build(),
      Cliente.builder().sharedKey("10").businessId("10").email("test.email.10@alianza.com.co").phone("3128309176").dataAdded("2024-06-18T23:06:49.971Z").build());
    return Flux.fromIterable(clientes);
  }

}
