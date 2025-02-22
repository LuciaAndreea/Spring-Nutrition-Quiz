package com.example.springnutritionquiz.service;

import com.example.springnutritionquiz.dao.QuestionDao;
import com.example.springnutritionquiz.dao.QuizDao;
import com.example.springnutritionquiz.model.Question;
import com.example.springnutritionquiz.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String difficulty, int numQ, String title) {

        List<Question> questions = questionDao.findRandomQuestionsByDifficulty(difficulty, numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Quiz created successfully", HttpStatus.CREATED);
    }
}
