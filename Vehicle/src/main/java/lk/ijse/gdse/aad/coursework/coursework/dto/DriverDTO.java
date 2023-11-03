package lk.ijse.gdse.aad.coursework.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDTO {
    private String driverId;
    private String driverName;
    private String driverContact;
    private String licenseFront;
    private String licenseBack;
    private String nicFront;
    private String nicBack;
    private String driverDob;
    private String driverAddress;
}
