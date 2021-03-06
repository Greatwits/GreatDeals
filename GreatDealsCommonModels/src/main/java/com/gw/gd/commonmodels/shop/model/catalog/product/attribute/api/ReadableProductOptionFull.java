package com.gw.gd.commonmodels.shop.model.catalog.product.attribute.api;

import java.util.ArrayList;
import java.util.List;

import com.gw.gd.commonmodels.shop.model.catalog.product.attribute.ProductOptionDescription;

public class ReadableProductOptionFull extends ReadableProductOptionEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private List<ProductOptionDescription> descriptions = new ArrayList<ProductOptionDescription>();
  public List<ProductOptionDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<ProductOptionDescription> descriptions) {
    this.descriptions = descriptions;
  }

}
