package ru.lotnik.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "delivery")
@Entity
public class Delivery extends Base {

    private String city;

    private String address;
}
