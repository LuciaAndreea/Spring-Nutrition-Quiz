package com.example.springnutritionquiz.controller;

import com.example.springnutritionquiz.Question;
import com.example.springnutritionquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("difficulty/{difficultyLevel}")
    public ResponseEntity<List<Question>> getQuestionsByDifficult(@PathVariable String difficultyLevel){
         return questionService.getQuestionsByDifficulty(difficultyLevel);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
       return questionService.addQuestion(question);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteQuestion(@RequestBody Question question){
        return questionService.deleteQuestion(question);
    }
}
