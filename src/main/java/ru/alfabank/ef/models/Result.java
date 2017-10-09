package ru.alfabank.ef.models;

import lombok.Getter;
import lombok.Setter;

public class Result {

    public Result() {

    }

    public Result(Status status, String msisdn, Imei imei) {
        this.status = status;
        this.msisdn = msisdn;
        this.imei = imei;
    }

    @Getter @Setter private Status status;
    @Getter @Setter private String msisdn;
    @Getter @Setter private Imei imei;
}
