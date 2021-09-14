package com.gw.gd.commonmodels.shop.store.controller.product.facade;

import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.core.model.reference.language.Language;
import com.gw.gd.commonmodels.shop.model.catalog.product.variation.PersistableProductVariation;
import com.gw.gd.commonmodels.shop.model.catalog.product.variation.ReadableProductVariation;
import com.gw.gd.commonmodels.shop.model.entity.ReadableEntityList;

public interface ProductVariationFacade {
	
	
	ReadableProductVariation get(Long id, MerchantStore store, Language language);
	boolean exists(String code, MerchantStore store);
	void create(PersistableProductVariation optionSet, MerchantStore store, Language language);
	void update(Long id, PersistableProductVariation variation, MerchantStore store, Language language);
	void delete(Long id, MerchantStore store);
	ReadableEntityList<ReadableProductVariation> list(MerchantStore store, Language language, int page, int count);
	
	
	

}
