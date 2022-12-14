package MindStore.dataloader.productsFetch;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ApiProduct {
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private ApiRating rating;
}
