package br.com.valdircezar.webfluxcourse.repository;

import br.com.valdircezar.webfluxcourse.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final ReactiveMongoTemplate mongoTemplate;

    public Mono<User> save(final User user) {
        return mongoTemplate.save(user);
    }

    public Mono<User> findById(String id) {
        return mongoTemplate.findById(id, User.class);
    }

    public Flux<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }
}
