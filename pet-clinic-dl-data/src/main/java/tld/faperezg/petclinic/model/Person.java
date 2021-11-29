package tld.faperezg.petclinic.model;

import java.util.Objects;

public abstract class Person extends BaseModel {

	private String firstName;

	private String lastName;

	protected Person () {
		super ();
	}

	public String getFirstName () {
		return firstName;
	}

	public String getLastName () {
		return lastName;
	}

	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public void setLastName (String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals (Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass () != o.getClass ()) {
			return false;
		}
		if (!super.equals (o)) {
			return false;
		}
		Person person = (Person) o;
		return Objects.equals (firstName, person.firstName) && Objects.equals (lastName, person.lastName);
	}

	@Override
	public int hashCode () {
		return Objects.hash (super.hashCode (), firstName, lastName);
	}

	@Override
	public String toString () {
		return "Person{" +
			   "firstName='" + firstName + '\'' +
			   ", lastName='" + lastName + '\'' +
			   "} " + super.toString ();
	}

}
