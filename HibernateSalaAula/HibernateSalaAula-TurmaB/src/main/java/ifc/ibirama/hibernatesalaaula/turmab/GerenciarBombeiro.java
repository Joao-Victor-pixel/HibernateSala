/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab;

import ifc.ibirama.hibernatesalaaula.turmab.entidades.Bombeiro;
import ifc.ibirama.hibernatesalaaula.turmab.entidades.Usuario;
import ifc.ibirama.hibernatesalaaula.turmab.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Sessão estabelecida");
        
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("10000000001");
        bombeiro01.setNome("Marquinhos Graus primeiro");
        bombeiro01.setGuerra("Graurudo");
        bombeiro01.setDataNascimento(LocalDate.of(2010, Month.JULY, 15));
        
        Usuario usuario01 = new Usuario();
        usuario01.setLogin("Marquinhos.Graus");
        usuario01.setSenha("12345");
        
        bombeiro01.setUsuario(usuario01);
        usuario01.setBombeiro(bombeiro01);
        
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro01);
            sessao.persist(usuario01);
            
            transacao.commit();
            
            System.out.println("Bombeiro salvo");
        } catch (Exception error) {
            if (transacao!=null) {
                transacao.rollback();
            }
        }
        
        HibernateUtil.shutdown();
    }
}
