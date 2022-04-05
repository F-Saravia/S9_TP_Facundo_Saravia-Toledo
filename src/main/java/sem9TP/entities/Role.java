package sem9TP.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
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

}
