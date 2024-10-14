package esprit.tn.reposetry;

import esprit.tn.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository <Chambre, Long> {
}
