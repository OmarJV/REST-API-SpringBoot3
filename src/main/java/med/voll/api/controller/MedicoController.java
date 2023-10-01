package med.voll.api.controller;

import med.voll.api.medico.DatosRegistroMedico;
import med.voll.api.medico.MedicoRepository;
import med.voll.api.medico.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    //NO RECOMENDABLE AUTOWIRED
    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroMedico datosRegistroMedico){
       // System.out.println("El request ha llegado  correctamente");
        System.out.println(datosRegistroMedico);
        medicoRepository.save(new Medico(datosRegistroMedico));
    }
}
