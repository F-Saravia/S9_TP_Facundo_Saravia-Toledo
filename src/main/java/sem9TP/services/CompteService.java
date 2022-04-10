package sem9TP.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import sem9TP.daoJPARepositories.AdminDAO;
import sem9TP.daoJPARepositories.RoleDAO;
import sem9TP.entities.Admin;
import sem9TP.entities.Role;

public class CompteService implements CompteInterface {

	@Autowired
	private AdminDAO adminDAO;
	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	public Admin createAdmin(@Valid Admin admin) {
		return adminDAO.save(admin) ;
	}

	@Override
	public Role createRole(@Valid Role role) {
		return roleDAO.save(role);
	}

	@Override
	public Optional<Admin> readAdminByLogin(String login) {
		return adminDAO.findById(login);
	}

	@Override
	public List<Admin> readAdminsByLoginContaining(String login) {
		return adminDAO.findByLoginContains(login);
	}

	@Override
	public void addRoleToAdmin(@Valid Admin admin, @Valid Role role) {
		if( adminDAO.findById( admin.getLogin()).isPresent() ) {
			List<Role> roles = admin.getRolesRoleName();
			roles.add(role);
			admin.setRolesRoleName(roles);
		}else {
			// TODO
			//changer void->boolean et retourner true/false si ça marche ou pas??
			//proposer de chercher findByLoginCONTAINING (String login)??
			//rediriger vers création d'un admin????
		}
	}

	@Override
	public void addRoleToAdmin(String login, @Valid Role role) {
		Optional<Admin> admin = adminDAO.findById( login ); 
		if( admin.isPresent()) {
			List<Role> roles = admin.get().getRolesRoleName();
			roles.add(role);
			admin.get().setRolesRoleName(roles);
		}else {
			// TODO
			//changer void->boolean et retourner true/false si ça marche ou pas??
			//proposer de chercher findByLoginCONTAINING (String login)??
			//rediriger vers création d'un admin????
		}
	}

	@Override
	public void updateTelephone(String login, String telephone) {
		Optional<Admin> admin = adminDAO.findById( login );
		if( admin.isPresent() ) {
			admin.get().setTelephone(telephone);
		}else {
			// TODO
			//changer void->boolean et retourner true/false si ça marche ou pas??
			//proposer de chercher findByLoginCONTAINING (String login)??
			//rediriger vers création d'un admin????
		}
	}

	@Override
	public void updateMotDePasse(String login, String oldMotDePasse, String newMotDePasse) {
		Optional<Admin> admin = adminDAO.findById( login );
		if( admin.isPresent() ) {
			//TODO
			//changer void->boolean et retourner true/false si ça marche ou pas??
			//comment comparer l'ancien mdp avec celui entré pour la confirmation?
			if(true) {
				admin.get().setPassword(newMotDePasse);
			}
			
		}else {
			// TODO
			//changer void->boolean et retourner true/false si ça marche ou pas??
			//proposer de chercher findByLoginCONTAINING (String login)??
			//rediriger vers création d'un admin????
		}
	}

	@Override
	public void deleteByLogin(String login) {
		adminDAO.deleteById(login);
	}

}
