package br.com.mercadoteixeira.inventorycontrol.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PRODUCTS")
@Data public class Products extends AbstractEntity<Long> {
    
    @Column(name = "productDescription", nullable = false, unique = true, lenght = 60)
    private String productDescription;
    @Column(name = "productCode", nullable = false, unique = true, lenght = 13)
    private Long productCode;
    @Column(name = "productQuantity", nullable = false, unique = true, lenght = 60)
    private Integer productQuantity;
    @Column(name = "productPrice", nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00" unique = true, lenght = 60)
    private BigDecimal productPrice;

}
