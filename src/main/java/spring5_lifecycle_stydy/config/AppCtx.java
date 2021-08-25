package spring5_lifecycle_stydy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5_lifecycle_stydy.spring.Client2;

@Configuration
@ComponentScan(basePackages = {"spring5_lifecycle_stydy.spring"})
public class AppCtx {
	
	@Bean(initMethod = "connect", destroyMethod = "close")
	public Client2 client2() {
		return new Client2();
	}
}
