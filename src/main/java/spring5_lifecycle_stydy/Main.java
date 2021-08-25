package spring5_lifecycle_stydy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring5_lifecycle_stydy.config.AppCtx;
import spring5_lifecycle_stydy.spring.Client;
import spring5_lifecycle_stydy.spring.Client2;

public class Main {
	public static void main(String[] args) {
		
		try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class)){
			Client client = ctx.getBean(Client.class);
			client.setHost("신범건");
			client.send();
			
			Client2 client2 = ctx.getBean(Client2.class);
			client2.setHost("신범건");
			client2.send();
		}
		
		
	}
}
