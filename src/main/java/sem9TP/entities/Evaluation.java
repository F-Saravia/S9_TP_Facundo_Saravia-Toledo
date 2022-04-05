package sem9TP.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Evaluation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Titre invalide, ne peut pas être vide")
	private String titre;

	@Min(value = 1, message = "Note invalide, la note doit être entre 1 et 5")
	@Max(value = 5, message = "Note invalide, la note doit être entre 1 et 5")
	private int note;

	@Lob
	private String remarque;

	@Column(nullable = false)
	private String nom;

	public Evaluation() {
		super();
	}

	public Evaluation(@NotBlank(message = "Titre invalide, ne peut pas être vide") String titre,
			@Min(value = 1, message = "Note invalide, la note doit être entre 1 et 5") @Max(value = 5, message = "Note invalide, la note doit être entre 1 et 5") int note,
			String remarque, String nom) {
		super();
		this.titre = titre;
		this.note = note;
		this.remarque = remarque;
		this.nom = nom;
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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}