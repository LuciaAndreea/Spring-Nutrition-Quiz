package com.example.springnutritionquiz.dao;

import com.example.springnutritionquiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
