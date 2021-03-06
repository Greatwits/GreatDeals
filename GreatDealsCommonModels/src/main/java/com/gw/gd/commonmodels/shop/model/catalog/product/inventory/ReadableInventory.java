package com.gw.gd.commonmodels.shop.model.catalog.product.inventory;

import java.util.List;

import com.gw.gd.commonmodels.shop.model.catalog.product.ReadableProductPrice;
import com.gw.gd.commonmodels.shop.model.store.ReadableMerchantStore;

public class ReadableInventory extends InventoryEntity {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String creationDate;
  
  private ReadableMerchantStore store;
  private List<ReadableProductPrice> prices;
  public ReadableMerchantStore getStore() {
    return store;
  }
  public void setStore(ReadableMerchantStore store) {
    this.store = store;
  }
  public List<ReadableProductPrice> getPrices() {
    return prices;
  }
  public void setPrices(List<ReadableProductPrice> prices) {
    this.prices = prices;
  }
  public String getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

}
