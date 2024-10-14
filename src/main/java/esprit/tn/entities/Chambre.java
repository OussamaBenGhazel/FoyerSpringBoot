package esprit.tn.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {

    @ManyToOne
    private Bloc bloc;

    @OneToMany
    List<Reservation> reservationList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChanbre;*

    private Long NumeroChanbre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
