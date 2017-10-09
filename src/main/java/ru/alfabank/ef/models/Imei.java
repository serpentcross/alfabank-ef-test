package ru.alfabank.ef.models;

import lombok.Getter;
import lombok.Setter;

public class Imei {

    public Imei() {

    }

    public Imei(String value, long time) {
        this.value = value;
        this.time = time;
    }

    @Getter @Setter private String value;
    @Getter @Setter private long time;
}
