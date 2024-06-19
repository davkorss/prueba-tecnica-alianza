package co.com.alianza.microservicio.useCase;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudConsultaCliente;
import co.com.alianza.microservicio.model.cliente.repository.ConsultaClienteRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class BuscarClientesUseCaseTest {

  private final List<Cliente> clientes = List.of(
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
  @InjectMocks
  private BuscarClientesUseCase useCase;
  @Mock
  private ConsultaClienteRepository repository;

  @Test
  @DisplayName("debería obtener una lista de clientes")
  public void deberiaObtenerUnaListaDeClientes() {
    when(repository.buscarPorFiltro(any())).thenReturn(Flux.fromIterable(clientes));
    final Flux<Cliente> clientesFlux = useCase.ejecutar(SolicitudConsultaCliente.builder().build());
    StepVerifier.create(clientesFlux).assertNext(cliente -> {
      assertThat(cliente.getSharedKey()).isNotNull();
      assertThat(Integer.parseInt(cliente.getSharedKey()) > 0 && Integer.parseInt(cliente.getSharedKey()) < 11).isTrue();
      assertThat(cliente.getEmail().endsWith("@alianza.com.co")).isTrue();
      assertThat(cliente.getPhone().length()).isEqualTo(10);
    });
  }

  @Test
  @DisplayName("debería obtener una lista de clientes filtrada por shared key")
  public void deberiaObtenerUnaListaDeClientesFiltradaPorSharedKey() {
    when(repository.buscarPorFiltro(any())).thenReturn(Flux.fromIterable(clientes));
    final Flux<Cliente> clientesFlux = useCase.ejecutar(SolicitudConsultaCliente.builder().sharedKey("6").build());
    StepVerifier.create(clientesFlux).assertNext(cliente -> {
      assertThat(cliente.getSharedKey()).isNotNull();
      assertThat(Integer.parseInt(cliente.getSharedKey())).isEqualTo(6);
      assertThat(cliente.getEmail().endsWith("@alianza.com.co")).isTrue();
      assertThat(cliente.getPhone().length()).isEqualTo(10);
    });
  }

}
