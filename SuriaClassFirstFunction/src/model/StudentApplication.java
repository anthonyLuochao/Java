package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApplication {

	public static void main(String[] args) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
		Student s1=new Student("mm",LocalDateTime.parse
				("1-Jan-1990 09:00", df),"s2234567","nick","100");
		Student s2=new Student("ff",LocalDateTime.parse
				("1-Jan-1991 09:00", df),"s1234567","nick","90 ");
		ArrayList<Student> arrList=new ArrayList<Student>();
		arrList.add(s1);
		arrList.add(s2);
		Collections.sort(l, new NameComparator());
		for(Student s:l)
		{
			System.out.println(s);
		}
		Collections.sort(l);
		for(Student s:l)
		{
			System.out.println(s);
		}
		Collections.sort(arrList,(o1, o2) -> o1.getMark().compareTo(o2.getMark()));
		arrList.sort((o1, o2) -> o1.getMark().compareTo(o2.getMark()));
		
		
 
	}

}
