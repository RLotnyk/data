package ru.lotnik.data.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryDto {

    @JsonProperty("title")
    private String title;

    @JsonProperty("sub_category")
    private CategoryDto subCategory;
}
