package com.gw.gd.commonmodels.shop.store.controller.configurations;

import java.util.List;

import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.shop.model.configuration.PersistableConfiguration;
import com.gw.gd.commonmodels.shop.model.configuration.ReadableConfiguration;

public interface ConfigurationsFacade {
	
	List<ReadableConfiguration> configurations(MerchantStore store);
	
	ReadableConfiguration configuration(String module, MerchantStore store);
	
	void saveConfiguration(PersistableConfiguration configuration, MerchantStore store);
	
	void deleteConfiguration(String module, MerchantStore store);

}
