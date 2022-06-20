package com.moderna.cadastromedicamentos.Service;

import com.moderna.cadastromedicamentos.Model.Medicamentos;
import com.moderna.cadastromedicamentos.Repository.MedicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentosService {

    @Autowired
    MedicamentosRepository medicamentosRepository;


    public Medicamentos salvarMedicamento (Medicamentos medicamentos){
        return medicamentosRepository.save(medicamentos);
    }
    public List<Medicamentos> listarMedicamentos(){
        return (List<Medicamentos>) medicamentosRepository.findAll();
    }
    public Optional<Medicamentos> buscarMedicamento(@RequestParam Long id){
        return medicamentosRepository.findById(id);
    }
    public List<Medicamentos> buscarPorCodigo (@RequestParam Integer codigoProduto){
        return medicamentosRepository.findBycodigoProduto(codigoProduto);
    }
   public void  deletarMedicamento(@RequestParam Long id){
        medicamentosRepository.deleteById(id);
    }
}
