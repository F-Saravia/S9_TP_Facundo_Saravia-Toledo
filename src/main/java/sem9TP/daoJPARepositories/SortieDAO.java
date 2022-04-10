package sem9TP.daoJPARepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sem9TP.entities.Participant;
import sem9TP.entities.Sortie;

public interface SortieDAO extends JpaRepository<Sortie, Integer> {

	public List<Sortie> findByTitreContains (String titre);
	public List<Sortie> findByDestinationContains (String destination);
	public List<Sortie> findByDepartContains(String depart);
	public List<Sortie> findByRetourContains (String retour);
	public List<Sortie> findByDescriptionContains (String contenu);
	public List<Sortie> findByPrix (double prix);
	public List<Sortie> findByPrixLessThanEqual (double prix);
	public List<Sortie> findByPrixGreaterThanEqual (double prix);
	public List<Sortie> findByResponsableContains (String responsable);
	public List<Sortie> findByParticipantsContaining (Participant participant);
	public List<Sortie> findByParticipantsIn (List<Participant> participants);

}
