package esprit.tn.controller;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.services.IChambreService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Chambre")
@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    private IChambreService chambreService;


    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addchambre(c);
    }
    @Operation (description ="récupére  tout les chambres de la base de donnée")
    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return chambreService.getAllChambre();
    }
    @PutMapping("/updateChambre")
    Chambre updateChambre (@RequestBody Chambre c){
        return chambreService.updatechambre(c);
    }
    @DeleteMapping("/deleteChambre")
    void deleteChambre (@RequestBody Chambre idChambre){
         chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/findById")
    public Chambre findById(@RequestParam Long id) {
        return chambreService.findByID(id);
    }
}
