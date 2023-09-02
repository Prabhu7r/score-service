package com.scoreservice.services;

import com.scoreservice.entity.Scores;


import java.util.List;

public interface HighScoreService {

    public Scores registerScore(Scores scores) ;

    public List<Scores> scoresByTitle(String title);

    public List<Scores> scoresByUser(String userName);
}
