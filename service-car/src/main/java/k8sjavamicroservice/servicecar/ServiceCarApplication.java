package k8sjavamicroservice.servicecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCarApplication.class, args);
	}

}
