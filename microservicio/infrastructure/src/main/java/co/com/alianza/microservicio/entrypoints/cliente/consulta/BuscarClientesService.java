package co.com.alianza.microservicio.entrypoints.cliente.consulta;

import co.com.alianza.microservicio.model.cliente.entidad.Cliente;
import co.com.alianza.microservicio.model.cliente.entidad.SolicitudConsultaCliente;
import co.com.alianza.microservicio.useCase.BuscarClientesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@CrossOrigin("http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class BuscarClientesService {

  private final BuscarClientesUseCase useCase;

  @PostMapping(path = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Flux<Cliente> buscarPorFiltro(@RequestBody ConsultaCliente consulta) {
    return useCase.ejecutar(SolicitudConsultaCliente.builder().sharedKey(consulta.getSharedKey()).build());
  }

}
