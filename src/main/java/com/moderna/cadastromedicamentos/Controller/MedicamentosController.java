package com.moderna.cadastromedicamentos.Controller;

import com.moderna.cadastromedicamentos.Model.Medicamentos;
import com.moderna.cadastromedicamentos.Service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Medicamentos")
public class MedicamentosController {

    @Autowired
    MedicamentosService medicamentosService;

    @PostMapping("/salvar-medicamento")
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarMedicamento(@RequestBody Medicamentos medicamentos) {
        medicamentosService.salvarMedicamento(medicamentos);
    }

    @GetMapping("/listar-medicamentos")
    @ResponseStatus(HttpStatus.ACCEPTED)

    public List<Medicamentos> listarMedicamentos() {
        return medicamentosService.listarMedicamentos();
    }

    @GetMapping("/buscar-medicamento")
    @ResponseStatus(HttpStatus.ACCEPTED)

    public Optional<Medicamentos> buscarMedicamento(@RequestParam Long id) {
        return medicamentosService.buscarMedicamento(id);
    }

    @GetMapping("/buscar-medicamento-por-codigo")
    @ResponseStatus(HttpStatus.ACCEPTED)

    public List<Medicamentos> buscarProCodigo(@RequestParam Integer codigoProduto){
        return medicamentosService.buscarPorCodigo(codigoProduto);
    }
    @DeleteMapping("/deletar-medicamento")
    @ResponseStatus(HttpStatus.ACCEPTED)

    public void deletarMedicamento (@RequestParam Long id){
       medicamentosService.deletarMedicamento(id);
    }
}
