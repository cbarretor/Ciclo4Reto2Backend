/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usa.ElMercader2.repositorios.crud;

import usa.ElMercader2.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author DELL
 */
public interface CrudUserRepository extends MongoRepository<User, Integer> {
       
    @Query(value = "Select e from User e Where e.email = ?1 and e.password = ?2")
    public Optional<User> findByEmailandPassword(String email, String password);    
    
    //@Query(value = "Select e from User e Where e.email = ?1)
    public Optional<User> findByEmail(String email);
    
    //@Query("{id: ?0}")
    public Optional<User> getById(Integer id);    
    
}
