package DAO;


import models.Order;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.sessionFactoryCreator;

public class OrderDAO {

    public static void saveOrder( Order order ) {
        Session session = sessionFactoryCreator.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save( order );
        tx1.commit();
        session.close();
    }

    public static void deleteOrder( Order order ) {
        Session session = sessionFactoryCreator.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(order);
        tx1.commit();
        session.close();
    }
    public static Order findOrder( int id ) {
        Session session = sessionFactoryCreator.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Order order = session.get( Order.class, id );
        tx1.commit();
        session.close();
        return order;
    }
}
