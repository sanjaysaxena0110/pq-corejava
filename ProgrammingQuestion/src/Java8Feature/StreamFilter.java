package Java8Feature;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sanjay", "Salary Account", 59000 ));
		empList.add(new Employee("Deepak", "Saving Account", 150000));
		empList.add(new Employee("Nitin", "Saving Account", 200000));
		//find employee whose salaries are above 60000
		empList.stream().filter(emp->emp.getSalary()>60000).forEach(System.out::println);
	}
}

class Employee {
	private String name;
	private String account;
	private Integer salary;

	public Employee(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}

}