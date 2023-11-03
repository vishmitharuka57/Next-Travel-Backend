package lk.ijse.gdse.aad.cw.vishmi.cw_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Package {
    @Id
    private String packageId;
    private String type;
    private Date startDate;
    private Date endDate;
    private int noOfDays;
    private int noOfNights;
    private int noOfAdults;
    private int noOfChildren;
    private String travelArea;
    private String totalHeadCount;
    private String petsOrNot;
    private String guideOrNot;
    private String paymentStatus;
    private String hotelId;
    private String vehicleId;
    private String remarks;





}
