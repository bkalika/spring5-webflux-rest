package guru.springframework.spring5webfluxrest.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 5/9/2024
 */
@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    private String id;

    private String description;
}
