package br.com.mercadoteixeira.inventorycontrol.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Products extends AbstracEntity<Long> {


    private String productDescription;
    private Long productCode;
    private Integer productQuantity;
    private BigDecimal productPrice;

    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public Long getProductCode() {
        return productCode;
    }
    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }
    public Integer getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
}
