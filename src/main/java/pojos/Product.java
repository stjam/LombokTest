package pojos;

import lombok.*;

/**
 * Created by root on 14.01.2016.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"id"})
@ToString(of={"id","name"})
public class Product {
    private Long id;
    private String name;
    private String description;

}
