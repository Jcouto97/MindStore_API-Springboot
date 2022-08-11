package MindStore.command;

import MindStore.persistence.models.Category;
import MindStore.persistence.models.Rating;
import MindStore.persistence.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30, message = "Product name should have at least 2 characters")
    private String title;

    @NotEmpty
    @Min(0)
    @Max(100000)
    private double price;

    @NotEmpty
    @Size(min = 2, max = 500, message = "Description name should have at least 2 characters and 500 max")
    private String description;

    @NotNull //not null para numeros
    @Min(0)
    @Max(20)
    private int category;

    @NotEmpty
    @Size(min = 2, max = 60, message = "Image should have at least 2 characters and 60 max")
    private String image;

    @NotNull
    @Min(0)
    @Max(20)
    private int stock;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY) //automaticamente o admin vai adicionar no service com
    //rating de 0 estrelas e 0 count
    private int ratingId;
}