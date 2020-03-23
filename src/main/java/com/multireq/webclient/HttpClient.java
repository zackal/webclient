package com.multireq.webclient;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class HttpClient {

	private final WebClient webClient;

    public HttpClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://data.gov.sg/api/action/datastore_search").build();
    }

    public Mono<GovResponse> retrieveByUEN(String resource, String name) {
        return this.webClient.get().uri("?resource_id={resource}&q={name}", resource, name)
                        .retrieve().bodyToMono(GovResponse.class);
    }
    
}
