package com.sample.prods.web.screens.productcategory;

import com.haulmont.cuba.gui.screen.*;
import com.sample.prods.entity.ProductCategory;

@UiController("prods_ProductCategory.browse")
@UiDescriptor("product-category-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductCategoryBrowse extends MasterDetailScreen<ProductCategory> {
}