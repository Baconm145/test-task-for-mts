package utilities;

import models.Order;
import models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class sessionFactoryCreator {
    private static SessionFactory sessionFactory;

    private sessionFactoryCreator() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
                cfg.addAnnotatedClass(User.class);
                cfg.addAnnotatedClass(Order.class);
                builder.applySettings(cfg.getProperties());
                sessionFactory = cfg.buildSessionFactory( builder.build() );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
