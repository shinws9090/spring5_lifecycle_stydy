package spring5_lifecycle_stydy.spring;

import org.springframework.stereotype.Component;

@Component
public class Client2 {
	private String host;
	
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public void send() {
		System.out.println("Client.send() to"+host);
	}
	
	public void close() throws Exception {
		System.out.println("Client.close() 실행");
	}

	public void connect() throws Exception {
		System.out.println("Client.connect() 실행");
	}

}
