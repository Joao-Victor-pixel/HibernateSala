/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab;

import ifc.ibirama.hibernatesalaaula.turmab.entidades.Bombeiro;
import ifc.ibirama.hibernatesalaaula.turmab.util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author aluno
 */
public class ConsultarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        
        String meuHQL = "from Bombeiro"; //6767676767676767676767676767676767676767676767676767676767676767676767676767676767676767676767676767676767

        List<Bombeiro> bombeiro = sessao.createQuery(meuHQL, Bombeiro.class).getResultList();
        
        for (Iterator<Bombeiro> index = bombeiro.iterator(); index.hasNext();){
            Bombeiro meuBombeiro = index.next();
            System.out.println(meuBombeiro.getCpf());
        }
        
        HibernateUtil.shutdown();
    }
}
