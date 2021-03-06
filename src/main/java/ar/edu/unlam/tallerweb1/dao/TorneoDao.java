package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Fecha;
import ar.edu.unlam.tallerweb1.modelo.Torneo;
import java.util.*;

public interface TorneoDao {

	Torneo findByTournament(Torneo torneo);
	void save(Torneo torneo);
	void update(Torneo torneo);
	List<Torneo> findAll();
	Torneo findById(Long idTorneo);
	List<Fecha> getFechas(Long idTorneo);
}
