package logic;

import DAO.ClientDAO;
import DAO.OrderDAO;
import models.Order;
import models.User;

public class logic {

    public static void saveUser( User client ) {
        ClientDAO.saveUser( client );
    }

    public static void saveOrder( Order order ) {
        OrderDAO.saveOrder( order );
    }

    public static User getUser( int id ) {
        return ClientDAO.findUser( id );
    }

    public static Order getOrder( int id ) {
        return OrderDAO.findOrder( id );
    }

    public static void deleteUser( User user ) {
        ClientDAO.deleteUser( user );
    }

    public static void deleteOrder( Order order ) {
        OrderDAO.deleteOrder( order );
    }

}
