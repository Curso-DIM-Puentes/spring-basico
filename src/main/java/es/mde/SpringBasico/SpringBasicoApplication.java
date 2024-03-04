package es.mde.SpringBasico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import es.mde.ObjetoTipo;

@SpringBootApplication
@PropertySource({"application2.properties"})
public class SpringBasicoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBasicoApplication.class, args);
		
	
		ObjetoTipo miObjetoTipo = new ObjetoTipo();
		miObjetoTipo.init();
		miObjetoTipo = context.getBean("anotacion2",ObjetoTipo.class);
		miObjetoTipo.init();

		context.close();
	}

}
