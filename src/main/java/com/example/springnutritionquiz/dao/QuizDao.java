package com.example.springnutritionquiz.dao;

import com.example.springnutritionquiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
    List<Quiz> id(Integer id);
}
