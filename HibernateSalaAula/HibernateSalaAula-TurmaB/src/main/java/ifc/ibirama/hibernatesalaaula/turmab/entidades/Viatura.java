/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class Viatura {
    
    
    private Integer id;
    private String placa;
    private String combustivel;
    private LocalDate ultimaRevisao;
    private Integer km;
    
    //id
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer Id){
        this.id = Id;
    }
    
    //placa
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String Placa){
        this.placa = Placa;
    }
    
    //combustivel
    public String getCombustivel(){
        return combustivel;
    }
    
    public void setCombustivel(String Combustivel){
        this.combustivel = Combustivel;
    }
    
    //ultimaRevisao
    public LocalDate getUltimaRevisao(){
        return ultimaRevisao;
    }
    
    public void setUltimaRevisao(LocalDate UltimaRevisao){
        this.ultimaRevisao = UltimaRevisao;
    }
    
}
