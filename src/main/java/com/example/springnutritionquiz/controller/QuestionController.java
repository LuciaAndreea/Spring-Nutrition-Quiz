package com.example.springnutritionquiz.controller;

import com.example.springnutritionquiz.Question;
import com.example.springnutritionquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("difficulty/{difficultyLevel}")
    public List<Question> getQuestionsByDifficult(@PathVariable String difficultyLevel){
         return questionService.getQuestionsByDifficulty(difficultyLevel);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
       return questionService.addQuestion(question);
    }
}
