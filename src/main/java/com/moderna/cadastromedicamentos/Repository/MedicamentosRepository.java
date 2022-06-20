package com.moderna.cadastromedicamentos.Repository;

import com.moderna.cadastromedicamentos.Model.Medicamentos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface MedicamentosRepository extends CrudRepository<Medicamentos,Long> {

    List<Medicamentos> findBycodigoProduto(Integer CodigoProduto);

    //int deleteBycodigoProduto(Integer CodigoProduto);

}
