/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab;

import ifc.ibirama.hibernatesalaaula.turmab.entidades.Bombeiro;
import ifc.ibirama.hibernatesalaaula.turmab.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Sessão estabelecida");
        
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("00000000001");
        bombeiro01.setNome("Marquinhos do Grau Graurudo");
        bombeiro01.setGuerra("Graurudo");
        bombeiro01.setDataNascimento(LocalDate.of(2010, Month.JULY, 15));
        
        HibernateUtil.shutdown();
    }
}
