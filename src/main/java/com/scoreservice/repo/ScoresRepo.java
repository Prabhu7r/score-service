package com.scoreservice.repo;

import com.scoreservice.entity.Scores;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoresRepo extends MongoRepository<Scores, Integer> {

    @Aggregation(pipeline = {
            "{'$match':{'title':?0 }}",
            "{'$sort':{'title':-1, 'scores': -1}}"
    })
    public List<Scores> findByTitle(String title);

    @Aggregation(pipeline = {
            "{'$match':{'userName':?0 }}",
            "{'$sort':{'scores': -1, 'title':-1}}"
    })
    public List<Scores> findByUserName(String userName);
}
