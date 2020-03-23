package com.multireq.webclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebclientApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	HttpClient client;

	public static void main(String[] args) {
		SpringApplication.run(WebclientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Mono<GovResponse> url1 = client.retrieveByUEN("e8732ea3-adca-4ca0-9fef-2b90c7a24f06", "200202548H");
		Mono<GovResponse> url2 = client.retrieveByUEN("6b5cbfa7-b502-4ce6-875d-dafff7ff04f2", "200202548H");
		Mono<GovResponse> url3 = client.retrieveByUEN("3b8539bb-5c22-4540-a420-86db444810d3", "200202548H");

		Flux.merge(url1, url2, url3).subscribe(n -> logger.info("S: " + n.getResult().getRecords()));

	}

}
