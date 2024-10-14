package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addchambre (Chambre chambre);
    Chambre updatechambre (Chambre chambre);
    void deleteChambre (Long idChambre);
    List<Chambre> getAllChambre ();
    Chambre findByID (Long id);
}
