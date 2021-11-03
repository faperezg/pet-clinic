package tld.faperezg.petclinic.model;

import java.io.Serializable;

public class BaseModel implements Serializable {

	private Long id;

	public BaseModel () {
		super ();
	}

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

}
