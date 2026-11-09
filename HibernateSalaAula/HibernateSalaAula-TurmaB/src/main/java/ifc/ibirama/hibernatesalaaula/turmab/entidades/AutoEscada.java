/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author aluno
 */
@PrimaryKeyJoinColumn(name="id")
public class AutoEscada extends Viatura{
    private Integer id;
    private Integer alturaMaxima;
    
    public AutoEscada(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Integer alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoTanque) {
            AutoTanque aux = (AutoTanque) obj;

            /* if ((aux.getId().equals(this.Id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getId().equals(this.id))) {
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
