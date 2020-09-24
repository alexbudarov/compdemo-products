package com.sample.prods.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PRODS_PRODUCT")
@Entity(name = "prods_Product")
@NamePattern("%s|name")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -8096436893804526564L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORY_ID")
    private ProductCategory category;

    @Column(name = "PRICE")
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}