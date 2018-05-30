package model;
import java.time.LocalDateTime;
import java.util.Date;

public class Student implements Comparable<Student>{
	private String name;
	private LocalDateTime dob;
	private String nric;
	private String nickName;
	private String mark;
	public Student(String name, LocalDateTime localDateTime, String nric, String nickName,String mark) {
		super();
		this.name = name;
		this.dob = localDateTime;
		this.nric = nric;
		this.nickName = nickName;
		this.mark=mark;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNric() {
		return nric;
	}
	public void setNric(String nric) {
		this.nric = nric;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", dob=" + dob + ", nric=" + nric + ", nickName=" + nickName + ", mark=" + mark
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nric == null) ? 0 : nric.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (nric == null) {
			if (other.nric != null)
				return false;
		} else if (!nric.equals(other.nric))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		return this.getNric().compareToIgnoreCase(o.getNric());
	}
	

}
