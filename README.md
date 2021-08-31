# AM-TCESP-BACKEND

-------

Back-end da Avaliação Multidisciplinar baseada na challenge proposta pelo Tribunal de Contas do Estado de São Paulo.

Projeto feito usando SpringBoot.  
Hospedado no Heroku: https://backend-tcesp.herokuapp.com

## Endpoints:

### /muncipios
Responsavel por retornar uma lista com todos os municipios sob juristição do TCESP

### /receitas
Responsavel por retornar todas as receitas de um determinado municipio em um determinado periodo de tempo

**Exemplo de request:**

{  
    "municipio": "adamantina",  
    "ano": "2018",  
    "mes": "3"  
}

### /despesas
Responsavel por retornar todas as despesas de um determinado municipio em um determinado periodo de tempo

**Exemplo de request:**

{  
"municipio": "adamantina",  
"ano": "2018",  
"mes": "3"  
}
 
