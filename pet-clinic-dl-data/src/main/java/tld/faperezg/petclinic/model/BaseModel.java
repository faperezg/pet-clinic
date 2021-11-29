package tld.faperezg.petclinic.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class BaseModel implements Serializable {

	private Long id;

	protected BaseModel () {
		super ();
	}

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

	@Override
	public boolean equals (Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass () != o.getClass ()) {
			return false;
		}
		BaseModel baseModel = (BaseModel) o;
		return Objects.equals (id, baseModel.id);
	}

	@Override
	public int hashCode () {
		return Objects.hash (id);
	}

	@Override
	public String toString () {
		return "BaseModel{" +
			   "id=" + id +
			   '}';
	}

}
