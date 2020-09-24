package com.sample.prods.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.sample.prods.entity.Product;

@UiController("prods_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}