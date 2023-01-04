package br.com.valdircezar.webfluxcourse.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class User {

    @Id
    private String id;
    private String name;

    @Indexed(unique = true)
    private String email;
    private String password;
}
