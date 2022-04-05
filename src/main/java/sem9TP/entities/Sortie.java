package sem9TP.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@NotBlank(message = "Responsable invalide, ne peut pas être vide")
	private String responsable;

	@NotBlank(message = "Description invalide, ne peut pas être vide")
	private String description;
	
	@Min (value = 100, message="Prix invalide, le prix doit être supérieur à 100")
	private double prix;

}
