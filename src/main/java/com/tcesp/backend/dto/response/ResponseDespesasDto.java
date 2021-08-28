package com.tcesp.backend.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDespesasDto {

    @JsonProperty("orgao")
    String orgao;
    @JsonProperty("mes")
    String mes;
    @JsonProperty("evento")
    String evento;
    @JsonProperty("nr_empenho")
    String nr_empenho;
    @JsonProperty("id_fornecedor")
    String id_fornecedor;
    @JsonProperty("nm_fornecedor")
    String nm_fornecedor;
    @JsonProperty("dt_emissao_despesa")
    String dt_emissao_despesa;
    @JsonProperty("vl_despesa")
    String vl_despesa;

}
