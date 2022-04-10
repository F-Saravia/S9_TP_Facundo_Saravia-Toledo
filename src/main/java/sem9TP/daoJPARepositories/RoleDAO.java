package sem9TP.daoJPARepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sem9TP.entities.Role;

public interface RoleDAO extends JpaRepository<Role, String> {

}
