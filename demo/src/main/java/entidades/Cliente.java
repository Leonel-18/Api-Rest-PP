package entidades;

import java.io.Serializable;


import jakarta.persistence.*;
import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
@Table(name = "cliente")
public class Cliente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column (name = "nombreC")
	private String nombreC;
	
	@Column (name = "apellidoC")
	private String apellidoC;
	
	@Column (name = "telefonoC")
	private int telefonoC;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn (name= "fk_administradorC")
	private Administrador administrador;


}