package user_service.model;

import jakarta.persistence.Entity;

@Entity
public class Role {

    private String user;
    private String admin;

}
