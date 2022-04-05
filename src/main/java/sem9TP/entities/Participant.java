package sem9TP.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
public class Participant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Nom invalide, doit contenir entre 4 et 50 caractères")
	@Size(min = 4, max = 50)
	private String nom;

	@NotBlank(message = "Prénom invalide, doit contenir entre 4 et 50 caractères")
	@Size(min = 4, max = 50)
	private String prenom;

	@Email(message = "e-Mail invalide")
	private String email;

	@NotBlank(message = "Téléphone invalide, ne peut pas être vide")
	private String telephone;

	@Positive(message = "Âge invalide")
	private int age;

	private int id_sortie;

	public Participant() {
		super();
	}

	public Participant(
			@NotBlank(message = "Nom invalide, doit contenir entre 4 et 50 caractères") @Size(min = 4, max = 50) String nom,
			@NotBlank(message = "Prénom invalide, doit contenir entre 4 et 50 caractères") @Size(min = 4, max = 50) String prenom,
			@Email(message = "e-Mail invalide") String email,
			@NotBlank(message = "Téléphone invalide, ne peut pas être vide") String telephone,
			@Positive(message = "Âge invalide") int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId_sortie() {
		return id_sortie;
	}

	public void setId_sortie(int id_sortie) {
		this.id_sortie = id_sortie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
