package lk.ijse.gdse.aad.vishmi.coursework.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelDTO {
    private String hotelId ;
    private String hotelName;
    private String category;
    private String location;
    private String locationLink;
    private String email;
    private String contact;
    private boolean petsAllowOrNot;
    private String fee;
    private String cancellationCriteria;
    private String starRate;

}
