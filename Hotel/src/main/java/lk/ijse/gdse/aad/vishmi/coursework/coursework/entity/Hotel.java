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
public class Hotel {
    @Id
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
