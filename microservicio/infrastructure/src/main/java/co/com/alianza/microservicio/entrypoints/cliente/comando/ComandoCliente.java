package co.com.alianza.microservicio.entrypoints.cliente.comando;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ComandoCliente {

  private String sharedKey;

}
