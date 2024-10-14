package esprit.tn.reposetry;

import esprit.tn.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BlocRepository extends JpaRepository <Bloc, Long> {
}
