package ru.alfabank.ef.dao;

import org.springframework.stereotype.Component;
import ru.alfabank.ef.constants.Regex;
import ru.alfabank.ef.constants.Statuses;
import ru.alfabank.ef.models.Answer;
import ru.alfabank.ef.models.Imei;
import ru.alfabank.ef.models.Status;
import ru.alfabank.ef.models.Result;

@Component
public class AnswerDAOImpl implements AnswerDAO {

    @Override
    public Answer executeRequest(String phone) {

        return phone.matches(Regex.PHONE_PATTERN) ?
                new Answer(
                        new Result(
                                new Status(Statuses.STATUS_OK, 1), phone, new Imei("JLSCWNdnO0lvl6vX0L2r+dsVcIZxEx6WruOt0g==", 11111123)))
                :
                new Answer(
                        new Result(
                                new Status(Statuses.STATUS_ERROR, 0), phone, new Imei("ERROR", 11111120))) ;
    }
}
