package com.gw.gd.commonmodels.shop.model.catalog.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.gw.gd.commonmodels.shop.model.catalog.product.attribute.ProductAttribute;

public class ProductPriceRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProductAttribute> options = new ArrayList<ProductAttribute>();

	public List<ProductAttribute> getOptions() {
		return options;
	}

	public void setOptions(List<ProductAttribute> options) {
		this.options = options;
	}

}
