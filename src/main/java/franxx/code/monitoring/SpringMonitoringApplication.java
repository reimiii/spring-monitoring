package franxx.code.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMonitoringApplication.class, args);
	}

}
