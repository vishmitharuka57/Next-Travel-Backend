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
public class Payment {
    @Id
    private String paymentId;
    private String userId;
    private String amount;
    private String date;
    private String slipImage;


}
