package co.com.alianza.microservicio.beans;

import co.com.alianza.microservicio.model.cliente.repository.ComandoClienteRepository;
import co.com.alianza.microservicio.model.cliente.repository.ConsultaClienteRepository;
import co.com.alianza.microservicio.useCase.BuscarClientesUseCase;
import co.com.alianza.microservicio.useCase.GuardarClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCases {

  @Bean
  public BuscarClientesUseCase buscarClientesUseCase(ConsultaClienteRepository consultaClienteRepository) {
    return new BuscarClientesUseCase(consultaClienteRepository);
  }

  @Bean
  public GuardarClienteUseCase guardarClienteUseCase(ComandoClienteRepository comandoClienteRepository) {
    return new GuardarClienteUseCase(comandoClienteRepository);
  }

}
