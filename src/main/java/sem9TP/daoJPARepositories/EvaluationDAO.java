package sem9TP.daoJPARepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sem9TP.entities.Evaluation;

public interface EvaluationDAO extends JpaRepository<Evaluation, Integer> {
	
	public List<Evaluation> findAllByOrderByNoteDesc ();
	public List<Evaluation> findAllByOrderByNoteAsc ();
	public List<Evaluation> findByNoteGreaterThanEqual(int note);
	public List<Evaluation> findByRemarqueContaining (String contenu);
}
