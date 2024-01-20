package lk.ijse.gdse.aad.vishmi.coursework.coursework.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String fName;
    private String lName;
    private String username;
    private String email;
    private String password;
    private String nicBothSide;
    private String dob;
    private String gender;
    private String profile;
    private String contact;
    private String address;



}
