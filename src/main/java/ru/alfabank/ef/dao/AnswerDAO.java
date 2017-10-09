package ru.alfabank.ef.dao;


import ru.alfabank.ef.models.Answer;

public interface AnswerDAO {
    Answer executeRequest(String phone);
}
