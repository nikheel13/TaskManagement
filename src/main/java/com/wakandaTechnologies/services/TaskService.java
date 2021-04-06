package com.wakandaTechnologies.services;



import java.util.List;

import com.wakandaTechnologies.models.Task;
import com.wakandaTechnologies.models.User;
import com.wakandaTechnologies.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    //Add task function
    public void addTask(Task task, User user) {
        task.setUser(user);
        taskRepository.save(task);
    }

   //Delete Task Function
    public void deleteTask(@PathVariable(value = "id")Long id, Model model){
        Task task = taskRepository.findOne(id);
        taskRepository.delete(task);
        model.addAttribute("task",taskRepository.findAll());
    }


    public List<Task>  findUserTask(User user){

        return taskRepository.findByUser(user);
    }

}
