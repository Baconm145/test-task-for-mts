package DAO;


import models.Order;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.sessionFactoryCreator;

public class ClientDAO {

    public static void saveUser( User client ) {
        Session session = sessionFactoryCreator.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(client);
        tx1.commit();
        session.close();
    }

    public static void deleteUser( User user ) {
        Session session = sessionFactoryCreator.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public static User findUser( int id ) {
        Session session = sessionFactoryCreator.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        User user = session.get( User.class, id );
        tx1.commit();
        session.close();
        return user;
    }
}
