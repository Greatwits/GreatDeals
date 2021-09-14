package com.gw.gd.commonmodels.shop.store.controller.order.facade.v1;

import com.gw.gd.commonmodels.core.model.customer.Customer;
import com.gw.gd.commonmodels.core.model.merchant.MerchantStore;
import com.gw.gd.commonmodels.core.model.order.Order;
import com.gw.gd.commonmodels.core.model.reference.language.Language;
import com.gw.gd.commonmodels.shop.model.order.v1.ReadableOrderConfirmation;

public interface OrderFacade {
	
	ReadableOrderConfirmation orderConfirmation(Order order, Customer customer, MerchantStore store, Language language);

}
