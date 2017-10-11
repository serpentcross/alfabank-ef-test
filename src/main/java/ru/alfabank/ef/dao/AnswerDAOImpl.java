package ru.alfabank.ef.dao;

import org.springframework.stereotype.Component;
import ru.alfabank.ef.constants.Regex;
import ru.alfabank.ef.constants.Statuses;
import ru.alfabank.ef.models.Answer;

@Component
public class AnswerDAOImpl implements AnswerDAO {

    @Override
    public Answer executeRequest(String phone) {
        return phone.matches(Regex.PHONE_PATTERN) ? new Answer(Statuses.STATUS_OK, 1) : new Answer(Statuses.STATUS_ERROR, 0);
    }
}
