package com.example.webflux.controller;

import com.example.webflux.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DummyController {

    WebClient client = WebClient.create("https://jsonplaceholder.typicode.com");

    @GetMapping("/todos")
    public Mono<?> getTodos() {
        Mono<Todo> todoMono = client.get()
                .uri("/todos/{id}", "1")
                .retrieve()
                .bodyToMono(Todo.class);

        return Mono.just(todoMono);
    }
}
