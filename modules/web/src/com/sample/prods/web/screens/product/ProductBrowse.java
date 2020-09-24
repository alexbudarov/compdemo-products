package com.sample.prods.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.sample.prods.entity.Product;

@UiController("prods_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}