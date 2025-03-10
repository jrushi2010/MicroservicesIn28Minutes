package com.in28minutes.microservices.currency_conversion_service;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalClaculatedAmount;
	private String environment;
	
	
	
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalClaculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalClaculatedAmount = totalClaculatedAmount;
		this.environment = environment;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public String getTo() {
		return to;
	}



	public void setTo(String to) {
		this.to = to;
	}



	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}



	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}



	public BigDecimal getQuantity() {
		return quantity;
	}



	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}



	public BigDecimal getTotalClaculatedAmount() {
		return totalClaculatedAmount;
	}



	public void setTotalClaculatedAmount(BigDecimal totalClaculatedAmount) {
		this.totalClaculatedAmount = totalClaculatedAmount;
	}



	public String getEnvironment() {
		return environment;
	}



	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	
	
}
