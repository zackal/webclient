package com.multireq.webclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BusinessController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	HttpClient client;

	@GetMapping("/business/{uen}")
	public Flux<GovResponse> getBook(@PathVariable String uen) {

//		Mono<GovResponse> url1 = client.retrieveByUEN("e8732ea3-adca-4ca0-9fef-2b90c7a24f06", "200202548H");
		Mono<GovResponse> url1 = client.retrieveByUEN("e8732ea3-adca-4ca0-9fef-2b90c7a24f06", uen);
		Mono<GovResponse> url2 = client.retrieveByUEN("6b5cbfa7-b502-4ce6-875d-dafff7ff04f2", uen);
		Mono<GovResponse> url3 = client.retrieveByUEN("3b8539bb-5c22-4540-a420-86db444810d3", uen);

//		return Flux.merge(url1, url2, url3).subscribe(n -> logger.info("S: " + n.getResult().getRecords()));
		return Flux.merge(url1, url2, url3);
	}

}
