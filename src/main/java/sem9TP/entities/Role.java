package sem9TP.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotBlank(message = "Rôle invalide, ne peut pas être vide")
	private String role;
	
	@ManyToMany
	@JoinTable(name = "adminRoles", joinColumns = @JoinColumn(name = "rolesRoleName", referencedColumnName = "role"), inverseJoinColumns = @JoinColumn(name = "adminLogin", referencedColumnName = "login"))
	private List<Admin> adminLogin = new ArrayList<Admin>();

	public Role() {
		super();
	}

	public Role(@NotBlank(message = "Rôle invalide, ne peut pas être vide") String role) {
		super();
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Admin> getAdminLogin() {
		return adminLogin;
	}

	public void setAdminLogin(List<Admin> adminLogin) {
		this.adminLogin = adminLogin;
	}

	@Override
	public String toString() {
		return this.role;
	}

}
