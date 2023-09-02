package com.scoreservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "scores")
public class Scores {

    @Id
    private Integer id;
    private String userName;
    private String title;
    private Integer score;

}
