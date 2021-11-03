package tld.faperezg.petclinic.model;

public class Person extends BaseModel {

	private String firstName;

	private String lastName;

	public Person () {
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

}
