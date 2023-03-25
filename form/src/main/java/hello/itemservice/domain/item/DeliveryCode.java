package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code; // System 간 사용 코드
    private String displayName; // Client 에게 보여줄 코드


}