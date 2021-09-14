package com.gw.gd.commonmodels.shop.model.order.transaction;

import com.gw.gd.commonmodels.core.model.payments.PaymentType;
import com.gw.gd.commonmodels.core.model.payments.TransactionType;

public class PersistablePayment extends PaymentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@com.gw.gd.commonmodels.shop.validation.Enum(enumClass=PaymentType.class, ignoreCase=true) 
	private String paymentType;
	
	@com.gw.gd.commonmodels.shop.validation.Enum(enumClass=TransactionType.class, ignoreCase=true) 
	private String transactionType;
	
	private String paymentToken;//any token after doing init
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getPaymentToken() {
		return paymentToken;
	}
	public void setPaymentToken(String paymentToken) {
		this.paymentToken = paymentToken;
	}
	

}
