package sem9TP.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Admin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotBlank(message = "login invalide")
	private String login;

	@NotBlank(message = "mot de passe invalide")
	private String password;

	@NotBlank(message = "Nom Complet invalide, taille entre 4 et 50 caractères")
	@Size(min = 4, max = 50)
	private String nomComplet;

	@NotBlank(message = "Adresse invalide")
	private String adresse;

	@NotBlank(message = "Téléphone invalide")
	private String telephone;

	private int active;

	@ManyToMany
	@JoinTable(name = "adminRoles", joinColumns = @JoinColumn(name = "adminLogin", referencedColumnName = "login"), inverseJoinColumns = @JoinColumn(name = "rolesRoleName", referencedColumnName = "role"))
	private List<Role> rolesRoleName = new ArrayList<Role>();

	@OneToOne
	@PrimaryKeyJoinColumn(referencedColumnName = "responsable")
	private Sortie uneSortie;

	public Admin() {
		super();
	}

	public Admin(@NotBlank(message = "login invalide") String login,
			@NotBlank(message = "mot de passe invalide") String password,
			@NotBlank(message = "Nom Complet invalide, taille entre 4 et 50 caractères") @Size(min = 4, max = 50) String nomComplet,
			@NotBlank(message = "Adresse invalide") String adresse,
			@NotBlank(message = "Téléphone invalide") String telephone, int active) {
		super();
		this.login = login;
		this.password = password;
//		this.nomComplet = nomComplet;
		this.adresse = adresse;
		this.telephone = telephone;
		this.active = active;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getNomComplet() {
//		return nomComplet;
//	}
//
//	public void setNomComplet(String nomComplet) {
//		this.nomComplet = nomComplet;
//	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Role> getRolesRoleName() {
		return rolesRoleName;
	}

	public void setRolesRoleName(List<Role> rolesRoleName) {
		this.rolesRoleName = rolesRoleName;
	}

	public Sortie getUneSortie() {
		return uneSortie;
	}

	public void setUneSortie(Sortie uneSortie) {
		this.uneSortie = uneSortie;
	}

}
