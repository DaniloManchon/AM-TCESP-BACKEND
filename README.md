# AM-TCESP-BACKEND

-------

Back-end da Avaliação Multidisciplinar baseada na challenge proposta pelo Tribunal de Contas do Estado de São Paulo.

Projeto feito usando SpringBoot.  
Hospedado no Heroku: https://backend-tcesp.herokuapp.com

## Endpoints:

### GET /muncipios
Responsavel por retornar uma lista com todos os municipios sob juristição do TCESP

### POST /receitas
Responsavel por retornar todas as receitas de um determinado municipio em um determinado periodo de tempo

### POST /despesas
Responsavel por retornar todas as despesas de um determinado municipio em um determinado periodo de tempo

**Exemplo de payload para receitas e despesas:**

{  
    "municipio": "adamantina",  
    "ano": "2018",  
    "mes": "3"  
}
 
---
Danilo M. dos Santos  
RM: 79990  

Jônatas Lima de Medeiros  
RM: 86272  
