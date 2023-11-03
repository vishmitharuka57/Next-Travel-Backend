package lk.ijse.gdse.aad.vishmi.coursework.coursework.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private String userId;
    private String role;
    private String userName;
    private String email;
    private String password;
    private String nicFront;
    private String nicBack;
    private String dob;
    private String gender;
    private String profile;
    private String contact;
    private String address;



}
