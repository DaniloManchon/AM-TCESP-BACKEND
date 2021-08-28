package com.tcesp.backend.service;

import com.tcesp.backend.dto.response.ResponseReceitasDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ReceitaService {
    public List<ResponseReceitasDto> getReceita(String municipio, String ano, String mes){
        RestTemplate restTemplate = new RestTemplate();

        //	https://transparencia.tce.sp.gov.br/api/{formato}/receitas/{municipio}/{exercício}/{mês}
        ResponseReceitasDto[] receita = restTemplate.getForObject(
                "https://transparencia.tce.sp.gov.br/api/json/receitas/"+municipio+"/"+ano+"/"+mes,
                ResponseReceitasDto[].class);

        return Arrays.asList(receita);
    }
}
