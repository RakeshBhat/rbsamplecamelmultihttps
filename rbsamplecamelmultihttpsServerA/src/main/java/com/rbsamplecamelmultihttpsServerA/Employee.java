package com.rbsamplecamelmultihttpsServerA;

public class Employee {

	String id;
	String name;
	String post;
	String jobDsc;
	String salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getJobDsc() {
		return jobDsc;
	}
	public void setJobDsc(String jobDsc) {
		this.jobDsc = jobDsc;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, post=%s, jobDsc=%s, salary=%s]", id, name, post, jobDsc,
				salary);
	}

}
