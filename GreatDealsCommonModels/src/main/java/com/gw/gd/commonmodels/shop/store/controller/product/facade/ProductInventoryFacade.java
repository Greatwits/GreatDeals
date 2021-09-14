package com.gw.gd.commonmodels.shop.store.controller.product.facade;

import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.core.model.reference.language.Language;
import com.gw.gd.commonmodels.shop.model.catalog.product.inventory.PersistableInventory;
import com.gw.gd.commonmodels.shop.model.catalog.product.inventory.ReadableInventory;
import com.gw.gd.commonmodels.shop.model.entity.ReadableEntityList;

public interface ProductInventoryFacade {

  ReadableEntityList<ReadableInventory> getInventory(Long productId, MerchantStore store, String child, Language language, int page, int count);
  
  ReadableInventory get(Long inventoryId, MerchantStore store, Language language);
  
  ReadableInventory get(Long productId, Long inventoryId, MerchantStore store, Language language);
  
  ReadableInventory get(Long productId, String child, Language language);
  
  ReadableInventory add(Long productId, PersistableInventory inventory, MerchantStore store, Language language);
  
  void update(Long productId, PersistableInventory inventory, MerchantStore store, Language language);
  
  void delete(Long inventoryId, MerchantStore store);
  
  

}
