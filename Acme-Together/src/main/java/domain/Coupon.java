
package domain;

import java.util.Collection;

import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Coupon extends DomainEntity {

	//Constructors -------------------------------------

	public Coupon() {
		super();
	}


	//Attributes ------------------------------------

	private String	couponNumber;
	private double	discount;
	private boolean	used;


	//Getters and Setters --------------------------

	@NotBlank
	public String getCouponNumber() {
		return this.couponNumber;
	}

	public void setCouponNumber(final String couponNumber) {
		this.couponNumber = couponNumber;
	}

	@NotBlank
	@Min((long) 0.0)
	@Max((long) 1.0)
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(final double discount) {
		this.discount = discount;
	}

	public boolean isUsed() {
		return this.used;
	}

	public void setUsed(final boolean used) {
		this.used = used;
	}

	private Collection<Order> orders;

	@OneToMany(mappedBy="coupon")
	@Valid
	@NotNull
	public Collection<Order> getOrders() {
		return orders;
	}

	public void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}
	
	
}
