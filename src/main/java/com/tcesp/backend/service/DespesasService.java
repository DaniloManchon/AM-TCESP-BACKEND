package com.tcesp.backend.service;

import com.tcesp.backend.dto.response.ResponseDespesasDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DespesasService {

    public List<ResponseDespesasDto> getDespesas(String municipio, String ano, String mes){
        RestTemplate restTemplate = new RestTemplate();

        //https://transparencia.tce.sp.gov.br/api/{formato}/municipios
        ResponseDespesasDto[] despesa = restTemplate.getForObject(
                "https://transparencia.tce.sp.gov.br/api/json/despesas/"+municipio+"/"+ano+"/"+mes,
                ResponseDespesasDto[].class);

        return Arrays.asList(despesa);
    }
}
