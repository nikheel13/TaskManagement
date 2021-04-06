package com.wakandaTechnologies.repositories;



import java.util.List;

import com.wakandaTechnologies.models.Task;
import com.wakandaTechnologies.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository  extends JpaRepository<Task, Long>{

    List<Task> findByUser(User user);

}
