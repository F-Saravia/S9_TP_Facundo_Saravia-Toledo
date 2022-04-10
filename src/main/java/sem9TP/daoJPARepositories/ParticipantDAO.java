package sem9TP.daoJPARepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sem9TP.entities.Participant;

public interface ParticipantDAO extends JpaRepository<Participant, Integer> {
	
	public List<Participant> findByNomContaining (String nom);
	public List<Participant> findByPrenomContaining ( String prenom);
	public List<Participant> findByNomContainingOrPrenomContaining (String nom, String prenom);
	public List<Participant> findByNomContainingAndPrenomContaining (String nom, String prenom);
	public List<Participant> findByEmailContaining (String email);

}
