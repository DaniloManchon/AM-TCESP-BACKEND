package com.tcesp.backend.service;

import com.tcesp.backend.dto.response.MunicipiosDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class MunicipioService {

    public List<MunicipiosDto> getMunicipios(){
        RestTemplate restTemplate = new RestTemplate();
        MunicipiosDto[] municipio = restTemplate.getForObject("https://transparencia.tce.sp.gov.br/api/json/municipios", MunicipiosDto[].class);
        return Arrays.asList(municipio);
    }
}
