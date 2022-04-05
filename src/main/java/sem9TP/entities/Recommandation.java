package sem9TP.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

@Entity
public class Recommandation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Titre invalide, ne peut pas être vide")
	private String titre;

	@Lob
	private String texte;

	@NotBlank(message = "Date invalide, ne peut pas être vide")
	private String date;

	public Recommandation() {
		super();
	}

	public Recommandation(@NotBlank(message = "Titre invalide, ne peut pas être vide") String titre, String texte,
			@NotBlank(message = "Date invalide, ne peut pas être vide") String date) {
		super();
		this.titre = titre;
		this.texte = texte;
		this.date = date;
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

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
