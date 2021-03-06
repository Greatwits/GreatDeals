

package com.gw.gd.commonmodels.shop.model.catalog.product.attribute.api;

import com.gw.gd.commonmodels.shop.model.catalog.product.attribute.ProductOptionDescription;
import com.gw.gd.commonmodels.shop.model.catalog.product.attribute.ProductOptionEntity;

public class ReadableProductOptionEntity extends ProductOptionEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private ProductOptionDescription description;
  public ProductOptionDescription getDescription() {
    return description;
  }
  public void setDescription(ProductOptionDescription description) {
    this.description = description;
  }

}
