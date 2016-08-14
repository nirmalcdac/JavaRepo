import java.util.HashSet;

public class Mapping {
	public static void main(String[] args) {
		Employee employee = new Employee("nirmal", 24);
		Employee employee2 = new Employee("nirmal", 24);

		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(employee);
		System.out.println(employees.contains(employee2));
		System.out.println(
				"employee.hashCode():  " + employee.hashCode() + "  employee2.hashCode():" + employee2.hashCode());
	}
}

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// if (obj == this)
		// return true;
		// if (!(obj instanceof Employee))
		// return false;
		Employee employee = (Employee) obj;
		return employee.getAge() == this.getAge() && employee.getName() == this.getName();
	}

	// commented
	@Override
	public int hashCode() {
		int result = 1;
		result = 2 * result + age;
		result = 2 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}