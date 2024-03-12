package ru.lotnik.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product extends Base {

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Float price;

    @Column(name = "is_deleted")
    private boolean deleted;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "created_date")
    @Builder.Default
    private Instant created = Instant.now();

    @Column(name = "quantity")
    private int quantity;
}
