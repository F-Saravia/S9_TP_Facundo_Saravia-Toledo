package sem9TP.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Sortie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Titre invalide, ne peut pas être vide")
	private String titre;

	@NotBlank(message = "Destination invalide, ne peut pas être vide")
	private String destination;

	@NotBlank(message = "Départ invalide, ne peut pas être vide")
	private String depart;

	@NotBlank(message = "Retour invalide, ne peut pas être vide")
	private String retour;

	@NotBlank(message = "Nom du responsable invalide, ne peut pas être vide")
	private String responsable;

	@NotBlank(message = "Description invalide, ne peut pas être vide")
	private String description;

	@Min(value = 100, message = "Prix invalide, le prix doit être supérieur à 100")
	private double prix;

	@OneToOne
	@MapsId(value = "responsable")
	@JoinColumn(name = "responsable", referencedColumnName = "nomComplet")
	private Admin unAdmin;

	@OneToMany(mappedBy = "uneSortie")
	private List<Participant> participants = new ArrayList<Participant>();

	public Sortie() {
		super();
	}

	public Sortie(@NotBlank(message = "Titre invalide, ne peut pas être vide") String titre,
			@NotBlank(message = "Destination invalide, ne peut pas être vide") String destination,
			@NotBlank(message = "Départ invalide, ne peut pas être vide") String depart,
			@NotBlank(message = "Retour invalide, ne peut pas être vide") String retour,
			@NotBlank(message = "Responsable invalide, ne peut pas être vide") String responsable,
			@NotBlank(message = "Description invalide, ne peut pas être vide") String description,
			@Min(value = 100, message = "Prix invalide, le prix doit être supérieur à 100") double prix) {
		super();
		this.titre = titre;
		this.destination = destination;
		this.depart = depart;
		this.retour = retour;
		this.description = description;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getRetour() {
		return retour;
	}

	public void setRetour(String retour) {
		this.retour = retour;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Admin getUnAdmin() {
		return unAdmin;
	}

	public void setUnAdmin(Admin unAdmin) {
		this.unAdmin = unAdmin;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

}
