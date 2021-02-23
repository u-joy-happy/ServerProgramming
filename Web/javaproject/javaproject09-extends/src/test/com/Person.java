package test.com;

public /* final */ class Person {

	protected int age = 33;
	protected String name = "kims";
	
	public void sleep() {
		System.out.println("Person : sleep() --------");
	}
	
	public void eat() {
		System.out.println("Person : eat() --------");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
