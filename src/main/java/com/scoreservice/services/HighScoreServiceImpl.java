package com.scoreservice.services;

import com.scoreservice.entity.Scores;
import com.scoreservice.repo.ScoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighScoreServiceImpl implements HighScoreService {

    @Autowired
    private ScoresRepo scoresRepo;

    @Override
    public Scores registerScore(Scores scores) {
        return scoresRepo.save(scores);
    }

    @Override
    public List<Scores> scoresByTitle(String title) {
        return scoresRepo.findByTitle(title);
    }

    @Override
    public List<Scores> scoresByUser(String userName) {
        return scoresRepo.findByUserName(userName);
    }
}
