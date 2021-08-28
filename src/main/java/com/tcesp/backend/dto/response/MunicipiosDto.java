package com.tcesp.backend.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MunicipiosDto {

    @JsonIgnore
    @JsonProperty("municipio")
    String municipio;

    @JsonProperty("municipio_extenso")
    String muniExt;

}
