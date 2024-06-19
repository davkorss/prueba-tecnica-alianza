package co.com.alianza.microservicio.model.cliente.entidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Cliente {

  private String sharedKey;
  private String businessId;
  private String email;
  private String phone;
  private String dataAdded;

}
