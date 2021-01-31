package com.appsdeveloperblog.app.ws.io.repositories;

import com.appsdeveloperblog.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findUserByEmail(String email);

    //Query methods.  find tells JPA that this is a query method.  The 'ByUserId' tells the query method to search for a specific userId.
    // Ensure that the database has a user_id property.
    UserEntity findByUserId(String id);
}
