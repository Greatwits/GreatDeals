package com.gw.gd.commonmodels.shop.store.controller.product.facade;

import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.core.model.reference.language.Language;
import com.gw.gd.commonmodels.shop.model.catalog.product.type.PersistableProductType;
import com.gw.gd.commonmodels.shop.model.catalog.product.type.ReadableProductType;
import com.gw.gd.commonmodels.shop.model.catalog.product.type.ReadableProductTypeList;

public interface ProductTypeFacade {
  
  ReadableProductTypeList getByMerchant(MerchantStore store, Language language, int count, int page);
  
  ReadableProductType get(MerchantStore store, Long id, Language language);
  
  ReadableProductType get(MerchantStore store, String code, Language language);
  
  Long save(PersistableProductType type, MerchantStore store, Language language);
  
  void update(PersistableProductType type, Long id, MerchantStore store, Language language);
  
  void delete(Long id, MerchantStore store, Language language);
  
  boolean exists(String code, MerchantStore store, Language language);

}
