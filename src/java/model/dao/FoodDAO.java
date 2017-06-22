/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.polo.Foods;
import model.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Minh Quan
 */
public class FoodDAO {
    public static List<Foods> layDS(){
        List<Foods> lst = null;
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Foods";
            Query query = session.createQuery(hql);
            lst = query.list();
            
              
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lst;
    }
}
