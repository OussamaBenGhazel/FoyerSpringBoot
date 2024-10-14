package esprit.tn.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {

    @ManyToMany
    List<Etudiant> etudiantList;

    @Id
    @Column(unique = true, nullable = false)
    private String IdReservation;

    private Date anneeUniversitaire;

    private Boolean estValide;
}
