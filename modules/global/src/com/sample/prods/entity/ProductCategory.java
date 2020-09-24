package com.sample.prods.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PRODS_PRODUCT_CATEGORY")
@Entity(name = "prods_ProductCategory")
@NamePattern("%s|name")
public class ProductCategory extends StandardEntity {
    private static final long serialVersionUID = -1686313740448804922L;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "ALLOWED_FOR_CHILDREN")
    private Boolean allowedForChildren;

    public Boolean getAllowedForChildren() {
        return allowedForChildren;
    }

    public void setAllowedForChildren(Boolean allowedForChildren) {
        this.allowedForChildren = allowedForChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}