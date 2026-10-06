/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab;

import ifc.ibirama.hibernatesalaaula.turmab.entidades.Bombeiro;
import ifc.ibirama.hibernatesalaaula.turmab.util.HibernateUtil;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Sessao estabelecida com successo elevado a 1");
        Transaction transacao = null;
        
        Bombeiro bombeiro = new Bombeiro();
        bombeiro.setCpf("12345679");
        bombeiro.setDataNascimento(LocalDate.of(1990,2,2));
        bombeiro.setNome("Burg da Selva");
        bombeiro.setGuerra("Burgues");
        
        try {
            transacao = sessao.beginTransaction();
            sessao.persist(bombeiro);
            
            transacao.commit();
            
            System.out.println("Bombeiro 'Salvo'");
            
            sessao.close();
        } catch (Exception e) {
            if (transacao != null) {
                transacao.rollback();
            }
        }
        //eeeeeeeeeeeeeeeeeeeeeeeeee
        HibernateUtil.shutdown();
    }
}
