package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table ( name = "users" )
public class User {

    @Id
    @GenericGenerator( name="generator" , strategy="increment" )
    @GeneratedValue( generator="generator" )
    @Column( name = "id" )
    private int id;

    @Column( name = "firstname" )
    private String firstname;

    @Column( name = "secondname" )
    private String secondname;

    @OneToMany( mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    public User() {

    }

    public User( String firstname, String secondname ) {
        this.firstname = firstname;
        this.secondname = secondname;
        orders = new ArrayList<>();
    }

    public void addOrder( Order order ) {
        order.setUser( this );
    }

    public void deleteOrder( Order order ) {
        orders.remove( order );
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname;
    }

    public void serSecondname( String secondname ) {
        this.secondname = secondname;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders( List<Order> orders ) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", secondname=" + secondname +
                '}';
    }
}
