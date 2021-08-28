package com.tcesp.backend.controller;


import com.tcesp.backend.dto.response.MunicipiosDto;
import com.tcesp.backend.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {

    @Autowired
    MunicipioService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MunicipiosDto> getMunicipios() {
        return service.getMunicipios();
    }
}
