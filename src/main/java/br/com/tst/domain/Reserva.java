package br.com.tst.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Reserva implements Serializable {

    private Long id;
    private String data;
    private Veiculo veiculo;
    
}
