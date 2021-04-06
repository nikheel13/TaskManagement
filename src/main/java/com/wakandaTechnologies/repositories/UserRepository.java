package com.wakandaTechnologies.repositories;




import java.util.List;

import com.wakandaTechnologies.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {


    //Query to filter users
    List<User> findByNameLike(String name);

}
