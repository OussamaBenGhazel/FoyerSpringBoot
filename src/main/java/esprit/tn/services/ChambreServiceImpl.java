package esprit.tn.services;

import esprit.tn.entities.Chambre;
import esprit.tn.reposetry.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService{
    private final ChambreRepository chambreRepository;
    @Override
    public Chambre addchambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updatechambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Chambre idChambre) {
        chambreRepository.delete(idChambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findByID(Long id) {
        return chambreRepository.findById(id).get();
    }
}
