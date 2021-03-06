package com.gw.gd.commonmodels.shop.model.store;

import java.util.ArrayList;
import java.util.List;

import com.gw.gd.commonmodels.shop.model.entity.ReadableList;

public class ReadableMerchantStoreList extends ReadableList {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private List<ReadableMerchantStore> data = new ArrayList<ReadableMerchantStore>();

  public List<ReadableMerchantStore> getData() {
    return data;
  }

  public void setData(List<ReadableMerchantStore> data) {
    this.data = data;
  }

}
