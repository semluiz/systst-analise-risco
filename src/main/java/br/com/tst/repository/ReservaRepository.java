package br.com.tst.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tst.domain.Reserva;
import br.com.tst.domain.Veiculo;

@Component
public class ReservaRepository{
	
	@Autowired 
	private VeiculoTable table;
	
	public Reserva save ( Reserva reserva ) {
		ReservaTable.getInstance().getRecords().add( reserva );
		int i = ReservaTable.getInstance().getRecords().indexOf( reserva );
		Long id = Long.parseLong( String.valueOf( i ) );
		reserva.setId(id);
		return reserva; 
		
	}

	public void delete ( Reserva reserva ) {
		ReservaTable.getInstance().getRecords().clear();
	}

	public Reserva update ( Reserva reserva ) {
		return reserva;
	}
	
	public List<Reserva> findAll ( ) {
		return ReservaTable.getInstance().getRecords();
	}
	
}
