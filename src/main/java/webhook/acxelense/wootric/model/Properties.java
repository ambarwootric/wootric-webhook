package webhook.acxelense.wootric.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Properties {
	
	private int id;
	private String persona;
	private String pricingPlan;
	private String productPlan;
	private int purchaseDate;
	private int revenueAmount;
	
	public Properties() {
		
	}
	
	public Properties(String persona, String pricingPlan, String productPlan, int purchaseDate, int revenueAmount) {
		super();
		this.persona = persona;
		this.pricingPlan = pricingPlan;
		this.productPlan = productPlan;
		this.purchaseDate = purchaseDate;
		this.revenueAmount = revenueAmount;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false, unique = true)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getPricingPlan() {
		return pricingPlan;
	}

	public void setPricingPlan(String pricingPlan) {
		this.pricingPlan = pricingPlan;
	}

	public String getProductPlan() {
		return productPlan;
	}

	public void setProductPlan(String productPlan) {
		this.productPlan = productPlan;
	}

	public int getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(int purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getRevenueAmount() {
		return revenueAmount;
	}

	public void setRevenueAmount(int revenueAmount) {
		this.revenueAmount = revenueAmount;
	}

}
