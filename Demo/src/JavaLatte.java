import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaLatte {

	public static void main(String[] args) {
		boolean b;
	//	System.out.println(b);
		Latte l = new Latte("java.latte");   
        System.out.println(l.name);   
Comparator<Student> studentnameComparator= (s1,s2) -> {
	return s1.getName().compareTo(s2.getName());
};
int i=5,j=6;


Student s=new Student("1", "Shaswat", 9);
Student s1=new Student("2", "Kinjal", 8);

Set<Student> students=new TreeSet<Student>(studentnameComparator);
students.add(s1);students.add(s);

Map<Student,String> studentsMap=new TreeMap<>(studentnameComparator);
studentsMap.put(s1, "Lol");
studentsMap.put(s, "LOL");

//Collections.sort(list, studentnameComparator);
	}

}
