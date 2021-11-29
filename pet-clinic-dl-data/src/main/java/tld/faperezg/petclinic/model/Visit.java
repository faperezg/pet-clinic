package tld.faperezg.petclinic.model;

import java.time.LocalDate;
import java.util.Objects;

public class Visit extends BaseModel {

	private LocalDate date;

	private String description;

	private Pet pet;

	public LocalDate getDate () {
		return date;
	}

	public String getDescription () {
		return description;
	}

	public Pet getPet () {
		return pet;
	}

	public void setDate (LocalDate date) {
		this.date = date;
	}

	public void setDescription (String description) {
		this.description = description;
	}

	public void setPet (Pet pet) {
		this.pet = pet;
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
		Visit visit = (Visit) o;
		return Objects.equals (date, visit.date) && Objects.equals (description, visit.description) && Objects.equals (pet, visit.pet);
	}

	@Override
	public int hashCode () {
		return Objects.hash (super.hashCode (), date, description, pet);
	}

}
