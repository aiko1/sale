package sale.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sale.data.request.BuyRequest;
import sale.data.request.SellRequest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}

	@Override
	public void run(String... args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(new SellRequest(), 0, 5, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new BuyRequest(), 0, 5, TimeUnit.SECONDS);
	}
}