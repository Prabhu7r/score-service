package com.scoreservice.controller;

import com.scoreservice.entity.Scores;
import com.scoreservice.services.HighScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RegisterController {


    @Autowired
    private HighScoreService highScoreService;

    @PostMapping(path ="/register")
    public ResponseEntity<Scores> registerScore(@RequestBody Scores scores) {
        return ResponseEntity.ok().body(highScoreService.registerScore(scores));
    }

    @GetMapping(path = "/title/{title}")
    public ResponseEntity<List<Scores>> scoresByTitle(@PathVariable String title) {
        return ResponseEntity.ok().body(highScoreService.scoresByTitle(title));
    }

    @GetMapping(path ="/user/{user}")
    public ResponseEntity<List<Scores>> scoresByUser(@PathVariable String user) {
        return ResponseEntity.ok().body(highScoreService.scoresByUser(user));
    }

}
