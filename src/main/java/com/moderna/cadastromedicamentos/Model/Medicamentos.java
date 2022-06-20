package com.moderna.cadastromedicamentos.Model;

import net.bytebuddy.implementation.ToStringMethod;
import org.springframework.core.style.ToStringCreator;
import org.springframework.core.style.ToStringStyler;

import javax.persistence.*;

@Entity
@Table(name = "db_Medicamentos")
public class Medicamentos {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
     @Column(nullable = false, length = 25)
    private String nome;
     @Column(nullable = false)
    private String tipo;
     @Column(nullable = false)
    private String volume;
     @Column(nullable = false)
    private Integer codigoProduto;


    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getVolume() {
        return volume;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

}
