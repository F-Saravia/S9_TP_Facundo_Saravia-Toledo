package sem9TP.daoJPARepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sem9TP.entities.Recommandation;

public interface RecommandationDAO extends JpaRepository<Recommandation, Integer> {

	public List<Recommandation> findAll();
}
