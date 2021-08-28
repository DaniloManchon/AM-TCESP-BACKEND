package com.tcesp.backend.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseReceitasDto {

    @JsonProperty("orgao")
     String orgao;
    @JsonProperty("mes")
     String mes;
    @JsonProperty("ds_fonte_recurso")
     String ds_fonte_recurso;
    @JsonProperty("ds_cd_aplicacao_fixo")
     String ds_cd_aplicacao_fixo;
    @JsonProperty("ds_alinea")
     String ds_alinea;
    @JsonProperty("ds_subalinea")
     String ds_subalinea;
    @JsonProperty("vl_arrecadacao")
     String vl_arrecadacao;
}
