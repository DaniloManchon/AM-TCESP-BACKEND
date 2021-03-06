package com.tcesp.backend.controller;

import com.tcesp.backend.dto.request.Request;
import com.tcesp.backend.dto.response.ResponseReceitasDto;
import com.tcesp.backend.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    ReceitaService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ResponseReceitasDto> getReceita(@RequestBody Request request) {
        String municipio = request.getMunicipio();
        String ano = request.getAno();
        String mes = request.getMes();
        return service.getReceita(municipio,ano,mes);
    }
}

