/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table (name = "Patente")
public class Patente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "pat_id")
    private Integer id;
    @Column (name = "pat_sigla", length = 10, unique = true, nullable = false)
    private String sigla;
    @Column (name = "pat_descricao", length = 45, unique = false, nullable = false)
    private String descricao;

    private Set<Bombeiro> bombeiro = new HashSet<Bombeiro>();

    public Set<Bombeiro> getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Set<Bombeiro> bombeiro) {
        this.bombeiro = bombeiro;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patente) {
            Patente aux = (Patente) obj;

            /* if ((aux.getId().equals(this.Id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getSigla().equals(this.sigla))) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
