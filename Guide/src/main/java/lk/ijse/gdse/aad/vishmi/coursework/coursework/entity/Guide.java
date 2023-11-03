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
public class Guide {
    @Id
    private String guideId ;
    private String  guideName;
    private String  guideAddress;
    private String  guideDob;
    private String  guideGender;
    private int  guideContact;
    private String  guideProfile;
    private String  nicFront;
    private String  nicBack;
    private String  experience;
    private String  manDayValue;




}
