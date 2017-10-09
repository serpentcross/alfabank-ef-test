package ru.alfabank.ef.models;

import lombok.Getter;
import lombok.Setter;

public class Status {

    public Status() {

    }

    public Status(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Getter @Setter private String name;
    @Getter @Setter private int code;
}
