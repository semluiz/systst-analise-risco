package br.com.tst.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tst.domain.Reserva;
import br.com.tst.repository.ReservaRepository;

@RestController
@RequestMapping("/rest/reserva")
public class ReservaRestController {

    @Autowired 
    private ReservaRepository repository;

    @GetMapping
    public List<Reserva> findAll() {
        return (List<Reserva>) repository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva create(@RequestBody Reserva reserva ) {
    	List<Reserva> l = (List<Reserva>) repository.findAll();
    	int size = l.size();
    	boolean can = true;
    	for(int i = 0 ; i < size ; i++){
    		Reserva r = l.get(i);
    		if (reserva.getData() == r.getData() ){
    			can = false;
    		}
    	}
    	if ( can ) {
    		reserva = repository.save(reserva);
    	}
    	return reserva;
    }

}
