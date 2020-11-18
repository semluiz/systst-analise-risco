package br.com.tst.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import br.com.tst.domain.Reserva;
import br.com.tst.domain.Veiculo;

@Component
public final class ReservaTable {
	
	private static ReservaTable instance ;
	private static ArrayList<Reserva> records; 
	
	private ReservaTable(){
	}

	public static synchronized ReservaTable getInstance() {
		if ( instance== null ) {
			instance = new ReservaTable();
			instance.records = new ArrayList<>();
		}
		return instance;
	}

	public static ArrayList<Reserva> getRecords() {
		return records;
	}



}
