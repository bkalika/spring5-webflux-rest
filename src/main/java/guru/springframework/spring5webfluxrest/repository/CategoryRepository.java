package guru.springframework.spring5webfluxrest.repository;

import guru.springframework.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 5/9/2024
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
