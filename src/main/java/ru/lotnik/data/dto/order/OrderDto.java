package ru.lotnik.data.dto.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.lotnik.data.dto.profile.UserDto;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("items")
    private List<OrderItemDto> items;

    @JsonProperty("order_status")
    private String status;

    @JsonProperty("total_price")
    private Float totalPrice;

    @JsonProperty("user")
    private UserDto user;

}
