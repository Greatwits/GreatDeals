package com.gw.gd.commonmodels.shop.model.catalog.category;

import java.util.ArrayList;
import java.util.List;

import com.gw.gd.commonmodels.shop.model.entity.ReadableList;

public class ReadableCategoryList extends ReadableList {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private List<ReadableCategory> categories = new ArrayList<ReadableCategory>();
  public List<ReadableCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<ReadableCategory> categories) {
    this.categories = categories;
  }

}
