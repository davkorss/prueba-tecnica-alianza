package co.com.alianza.microservicio.entrypoints.cliente.comando;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudComandoCliente;
import co.com.alianza.microservicio.useCase.GuardarClienteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@CrossOrigin("http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class GuardarClientesService {

  private final GuardarClienteUseCase useCase;

  @PostMapping(path = "/clientes/new", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Cliente> buscarPorFiltro(@RequestBody ComandoCliente comando) {
    return useCase.ejecutar(SolicitudComandoCliente.builder().sharedKey(comando.getSharedKey()).build());
  }

}
