package lk.ijse.gdse.aad.coursework.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {
    private String vehicleId;
    private String brand;
    private String category;
    private String fuelType;
    private String hybridOrNot;
    private String fuelUsage;
    private String frontImage;
    private String sideImage;
    private String backImage;
    private String seatCapacity;
    private String transmissionType;
    private String feePer1KM;
}
