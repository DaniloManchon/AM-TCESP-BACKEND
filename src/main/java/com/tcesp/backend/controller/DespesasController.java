package com.tcesp.backend.controller;

import com.tcesp.backend.dto.request.Request;
import com.tcesp.backend.dto.response.ResponseDespesasDto;
import com.tcesp.backend.service.DespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesasController {
    @Autowired
    DespesasService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ResponseDespesasDto> getDespesas(@RequestBody Request request) {
        String municipio = request.getMunicipio();
        String ano = request.getAno();
        String mes = request.getMes();
        return service.getDespesas(municipio,ano,mes);
    }
}
