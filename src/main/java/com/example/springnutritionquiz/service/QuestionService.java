package com.example.springnutritionquiz.service;

import com.example.springnutritionquiz.Question;
import com.example.springnutritionquiz.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    public List<Question> getAllQuestions() {
       return questionDao.findAll();
    }

    public List<Question> getQuestionsByDifficulty(String difficultyLevel) {
        return questionDao.findByDifficultyLevel(difficultyLevel);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }
}
