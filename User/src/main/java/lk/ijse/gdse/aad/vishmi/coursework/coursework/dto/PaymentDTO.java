package lk.ijse.gdse.aad.vishmi.coursework.coursework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
    private String paymentId;
    private String userId;
    private String amount;
    private String date;
    private String slipImage;

}
