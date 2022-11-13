package thinkoutloud.firstproject.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import thinkoutloud.firstproject.data.dto.ProductDto;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "product") //how would you define the name in the database so we should use annotation table
public class Product extends BaseEntity{
    //these will go 1:1 mapping to the database
    @Id
    String id;

    String name;

    Integer price;

    Integer stock;

  /*
  @Column
  String sellerId;
  @Column
  String sellerPhoneNumber;
   */

    public ProductDto toDto(){
        return ProductDto.builder()
                .productId(id)
                .productName(name)
                .productPrice(price)
                .productStock(stock)
                .build();
    }

}
