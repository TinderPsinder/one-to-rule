package pl.zimny.chats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ChatsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatsServiceApplication.class, args);
	}

	@GetMapping(path = "/hello")
	public String hello(){
		return "Hello from chats service";
	}

}
