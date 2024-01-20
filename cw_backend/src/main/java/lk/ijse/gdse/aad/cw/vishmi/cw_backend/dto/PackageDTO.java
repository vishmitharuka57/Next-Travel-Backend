package lk.ijse.gdse.aad.cw.vishmi.cw_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PackageDTO {
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
