package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Mintu");
		empList.add("Akash");
		empList.add("Meg");
		empList.add("Lala");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}

public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		System.out.println(emps.getEmpList());
		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Vineet");
		System.out.println(list);
		
		System.out.println(emps.getEmpList());
	}
}
