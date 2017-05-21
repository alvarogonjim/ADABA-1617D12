
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Punctuation extends DomainEntity {

	//Constructors -------------------------------------

	public Punctuation() {
		super();
	}


	// Attributes

	@Range(min = -1, max = 1)
	private int	value;


	public int getValue() {
		return this.value;
	}

	public void setValue(final int value) {
		this.value = value;
	}


	// Relationships ------------------------------------

	private ShoppingGroup	shoppingGroup;
	private User			user;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(final User user) {
		this.user = user;
	}

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public ShoppingGroup getShoppingGroup() {
		return this.shoppingGroup;
	}

	public void setShoppingGroup(final ShoppingGroup shoppingGroup) {
		this.shoppingGroup = shoppingGroup;
	}

}
