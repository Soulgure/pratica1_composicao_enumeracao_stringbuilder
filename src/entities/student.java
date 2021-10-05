package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enum.status;

public class student {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private Integer age;
	private Double weight;
	private Double height;
	private List<info> list = new ArrayList<>();
	private status status;
	
	public student() {
	}
	
	public student(String name, Integer age, Double weight, Double height, status status) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.status = status;
	}
	
	public void addList(info text) {
		list.add(text);
	}
	
	public void removeList(info text) {
		list.remove(text);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Date when executed: " + sdf.format(new Date()) + "\n");
		sb.append("====== Student Information ====== " + "\n");
		sb.append("Student: " + this.getName() + "\n");
		sb.append("Age: " + this.getAge() + "\n");
		sb.append("Weight : " + String.format("%.2f",getWeight()) + "kg\n");
		sb.append("Height: " + String.format("%.2f", getHeight()) + "cm\n");
		sb.append("Status: " + status + "\n");
		sb.append("Extra INFO: " + "\n");
		for(info l : list) {
			sb.append(l.getText() + "\n");
		}
		return sb.toString();
		
	}
	
}
