package br.com.rts.estudos.graphql.customscalars.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private Boolean isOnSale;

    private Float weight;

    private BigDecimal price;

    private LocalDateTime dateCreated;

}
