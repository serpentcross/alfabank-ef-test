package ru.alfabank.ef.models;

import lombok.Getter;
import lombok.Setter;

public class Answer {

    public Answer() {

    }

    public Answer(Result result) {
        this.result = result;
    }

    @Getter @Setter private Result result;
}
