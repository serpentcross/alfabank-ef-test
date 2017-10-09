package ru.alfabank.ef.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ru.alfabank.ef.models.Answer;
import ru.alfabank.ef.dao.AnswerDAO;

@RestController
public class TestController {

    @Autowired AnswerDAO answerDAO;

    @RequestMapping(value = "/msisdns", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public Answer methodAdd(@RequestParam(value="phoneNumber", defaultValue="") String searchingParameter) throws JsonProcessingException {
        System.out.println(searchingParameter);
        return answerDAO.executeRequest(searchingParameter);
    }
}
