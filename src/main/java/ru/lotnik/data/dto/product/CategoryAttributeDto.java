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
public class CategoryAttributeDto {

    @JsonProperty("attribute")
    private AttributeDto attribute;

    @JsonProperty("category")
    private CategoryDto category;

}
