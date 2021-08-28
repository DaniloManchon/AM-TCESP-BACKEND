package com.tcesp.backend.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Request {

    @JsonProperty("municipio")
    String municipio;
    @JsonProperty("ano")
    String ano;
    @JsonProperty("mes")
    String mes;

    public String getMunicipio() {
        return municipio;
    }

    public String getAno() {
        return ano;
    }

    public String getMes() {
        return mes;
    }
}
