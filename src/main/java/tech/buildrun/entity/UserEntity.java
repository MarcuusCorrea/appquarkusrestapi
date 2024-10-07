package tech.buildrun.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID userid;

    private String username;

    public UserEntity() {
    }

    public UUID getUserId() {
        return userid;
    }

    public void setUserId(UUID userId) {
        this.userid = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}