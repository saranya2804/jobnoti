package com.Job.Job_Notification.Repository;

import com.Job.Job_Notification.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepo extends JpaRepository<User,Integer> {

    User findByUsername(String username);
}
