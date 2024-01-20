package lk.ijse.gdse.aad.coursework.coursework.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Driver {
    @Id
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
