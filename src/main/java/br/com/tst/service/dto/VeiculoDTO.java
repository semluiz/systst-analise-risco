package br.com.tst.service.dto;

import lombok.Data;

@Data
public class VeiculoDTO {

    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private Float valor;
}
