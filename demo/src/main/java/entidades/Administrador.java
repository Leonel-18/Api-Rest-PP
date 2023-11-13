package entidades;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


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
@Table(name = "administrador")


public class Administrador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column (name = "apellidoA")
    private String apellidoC;


    @Column (name = "nombreA")
    private String nombreC;


    @Column (name = "telefonoA")
    private int telefonoC;

    @OneToMany(mappedBy="administrador")
    private List<Cliente> cliente = new ArrayList<Cliente>();
}
