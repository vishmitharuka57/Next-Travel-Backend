package lk.ijse.gdse.aad.vishmi.coursework.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
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
