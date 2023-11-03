package lk.ijse.gdse.aad.vishmi.coursework.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuideDTO {
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
