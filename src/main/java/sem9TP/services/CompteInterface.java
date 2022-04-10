package sem9TP.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import sem9TP.entities.Admin;
import sem9TP.entities.Role;

public interface CompteInterface {

	//create
	public Admin createAdmin (@Valid Admin admin);
	public Role createRole (@Valid Role role);
	
	//read
	public Optional<Admin> readAdminByLogin(String login);
	public List<Admin> readAdminsByLoginContaining(String login);
	
	//update
	public void addRoleToAdmin (@Valid Admin admin, @Valid Role role);
	public void addRoleToAdmin (String login, @Valid Role role);
	public void updateTelephone (String login, String telephone);
	public void updateMotDePasse (String login, String oldMotDePasse, String newMotDePasse);
	
	//delete
	public void deleteByLogin (String login);
}
