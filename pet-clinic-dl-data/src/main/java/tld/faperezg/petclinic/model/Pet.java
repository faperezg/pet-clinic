package tld.faperezg.petclinic.model;

import java.time.LocalDate;
import java.util.Objects;

public class Pet extends BaseModel {

	private static final long serialVersionUID = 1L;

	public enum Type {
		CAT (0),
		DOG (1),
		PARROT (2),
		SNAKE (3);

		private final int value;

		Type (int value) {
			this.value = value;
		}

		public int value () {
			return this.value;
		}
	}

	private LocalDate birthDate;

	private Type type;

	private Owner owner;

	public Pet () {
		super ();
	}

	public LocalDate getBirthDate () {
		return birthDate;
	}

	public Type getType () {
		return type;
	}

	public Owner getOwner () {
		return owner;
	}

	public void setBirthDate (LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setType (Type type) {
		this.type = type;
	}

	public void setOwner (Owner owner) {
		this.owner = owner;
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
		Pet pet = (Pet) o;
		return Objects.equals (birthDate, pet.birthDate) && type == pet.type && Objects.equals (owner, pet.owner);
	}

	@Override
	public int hashCode () {
		return Objects.hash (super.hashCode (), birthDate, type, owner);
	}

	@Override
	public String toString () {
		return "Pet{" +
			   "birthDate=" + birthDate +
			   ", type=" + type +
			   ", owner=" + owner +
			   "} " + super.toString ();
	}

}
