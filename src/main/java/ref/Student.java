package ref;

public class Student {
	private int id;
	private Name name;

	public Student() {
		this(0, null);
	}
	public Student(int id, Name name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return id + ": " + name;
	}

}
