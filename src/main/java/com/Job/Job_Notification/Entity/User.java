package com.Job.Job_Notification.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {
    @Id
    private Long user_id;
    private String username;
    private String email;
    private String password;

    public Object getPassword() {
        return password;
    }
}
