package com.gw.gd.commonmodels.shop.model.catalog.product;

import com.gw.gd.commonmodels.shop.model.catalog.NamedEntity;

public class ProductPriceDescription extends NamedEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String priceAppender;

	public String getPriceAppender() {
		return priceAppender;
	}

	public void setPriceAppender(String priceAppender) {
		this.priceAppender = priceAppender;
	}

}
