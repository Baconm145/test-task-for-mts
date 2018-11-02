package controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import logic.logic;

import models.Order;
import models.User;

@RestController

public class RESTful {

    @GetMapping("/user")
    public String getUser(@RequestParam(value="id") int id) {
        ObjectMapper mapper = new ObjectMapper();
        User user = logic.getUser( id );
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(user);
        } catch ( Exception e ) {
            jsonInString =  e.toString();
        } finally {
            return jsonInString;
        }
    }

    @GetMapping("/order")
    public String getOrder( @RequestParam( value="id" , required=false ) Integer id) {
        if ( id == null ) {

        }
        ObjectMapper mapper = new ObjectMapper();
        Order order = logic.getOrder( id );
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString( order );
        } catch ( Exception e ) {
            jsonInString =  e.toString();
        } finally {
            return jsonInString;
        }
    }

    @PostMapping("/addUser")
    public void addUser( @RequestBody User user ) {
        logic.saveUser( user );
    }

    @PostMapping("/addOrder")
    public void addOrder( @RequestBody Order order ) {
        logic.saveOrder( order );
    }

    @GetMapping("/delOrder/{id}")
    public void delOrder( @PathVariable Integer id )  {
        Order order = logic.getOrder( id );
        logic.deleteOrder( order );
    }

    @GetMapping("/delUser/{id}")
    public void delUser( @PathVariable Integer id )  {
        User user = logic.getUser( id );
        logic.deleteUser( user );
    }
}
