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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */

@Entity
@Table (name = "Usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private Integer id;
    @Column(name = "usu_login")
    private String login;
    @Column(name = "usu_senha")
    private String senha;

    @OneToOne
    @JoinColumn(name = "bom_id", unique = true)
    private Bombeiro bombeiro;

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }
    
    public Usuario(){
        
    }
    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario aux = (Usuario) obj;

            /* if ((aux.getId().equals(this.Id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getLogin().equals(this.login))) {
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
