package esprit.tn.controller;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.services.IChambreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre (@RequestBody Chambre c){
        return chambreService.addchambre(c);
    }
    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return chambreService.getAllChambre();
    }
    @PutMapping("/updateChambre")
    Chambre updateChambre (@RequestBody Chambre c){
        return chambreService.updatechambre(c);
    }
    @DeleteMapping("/deleteChambre")
    void deleteChambre (@RequestBody Long idChambre){
         chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/findById")
    Chambre findById (Long id) { return chambreService.findByID(id); }
}
