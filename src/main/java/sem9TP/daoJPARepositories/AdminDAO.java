package sem9TP.daoJPARepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sem9TP.entities.Admin;

public interface AdminDAO extends JpaRepository<Admin, String> {

	public List<Admin> findByLoginContains(String login);
	public List<Admin> findByNomCompletContains (String nom);
	public List<Admin> findByLoginContainsOrNomCompletContains (String login, String nom);


}
