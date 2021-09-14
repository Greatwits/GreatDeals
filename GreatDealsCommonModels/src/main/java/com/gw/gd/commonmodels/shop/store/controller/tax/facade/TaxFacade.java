package com.gw.gd.commonmodels.shop.store.controller.tax.facade;

import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.core.model.reference.language.Language;
import com.gw.gd.commonmodels.shop.model.entity.Entity;
import com.gw.gd.commonmodels.shop.model.entity.ReadableEntityList;
import com.gw.gd.commonmodels.shop.model.tax.PersistableTaxClass;
import com.gw.gd.commonmodels.shop.model.tax.PersistableTaxRate;
import com.gw.gd.commonmodels.shop.model.tax.ReadableTaxClass;
import com.gw.gd.commonmodels.shop.model.tax.ReadableTaxRate;

public interface TaxFacade {
	
	
	//tax class
	Entity createTaxClass(PersistableTaxClass taxClass, MerchantStore store, Language language);
	void updateTaxClass(Long id, PersistableTaxClass taxClass, MerchantStore store, Language language);
	void deleteTaxClass(Long id, MerchantStore store, Language language);
	boolean existsTaxClass(String code, MerchantStore store, Language language);

	ReadableEntityList<ReadableTaxClass> taxClasses(MerchantStore store, Language language);
	ReadableTaxClass taxClass(String code, MerchantStore store, Language language);
	
	
	//tax rate
	Entity createTaxRate(PersistableTaxRate taxRate, MerchantStore store, Language language);
	void updateTaxRate(Long id, PersistableTaxRate taxRate, MerchantStore store, Language language);
	void deleteTaxRate(Long id, MerchantStore store, Language language);
	boolean existsTaxRate(String code, MerchantStore store, Language language);
	
	ReadableEntityList<ReadableTaxRate> taxRates(MerchantStore store, Language language);
	ReadableTaxRate taxRate(Long id, MerchantStore store, Language language);
	
	
	

}
