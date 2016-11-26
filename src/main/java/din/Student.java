package din;

public class Student {
	private int id;
	private String name;
	private float gpa;

	public Student() {
		id = 0; name = null; gpa = 0.0f;
		System.out.println("Student()");
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Student(" + id + "," + name + ")");
	}
	public Student(int id, String name, float gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa ;
		System.out.println("Student(" + id + "," + name + "," + gpa + ")");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setId(" + id + ")");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setName(" + name + ")");
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
		System.out.println("setGpa(" + gpa + ")");
	}
	
	@Override
	public String toString() {
		return id + ": " + name + ", " + gpa;
	}

}
