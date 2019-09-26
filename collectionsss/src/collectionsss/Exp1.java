package collectionsss;
import java.util.*; 
class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  
public class Exp1 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 ArrayList<Student> al=new ArrayList<Student>();  
		 list.add("Ravi");
         list.add("Vijay");  
         list.add("Ravi");  
         list.add("Ajay"); 
         
         Student std = new Student(101, "subahan", 24);
         Student std1 = new Student(102, "mahendra", 23);
         Student std2 = new Student(103, "avinash", 23);
         al.add(std);
         al.add(std1);  
         al.add(std2); 
         System.out.println("Traversing list through List Iterator:");  
         ListIterator<String> list1 = list.listIterator(list.size());
         while(list1.hasPrevious()) {
        	 String str= list1.previous();
        	 System.out.println(str);
         }
         System.out.println("Traversing list through for loop:");  
         
         for(int i=0; i<list.size(); i++) {
        	  System.out.println(list.get(i));   
         }
         
         System.out.println("Traversing list through forEach() method:");  
         
         for(String str: list) {
        	 System.out.println(str); 
         }
         Iterator itr = al.iterator();
         while(itr.hasNext()) {
        	 Student s = (Student)itr.next();
        	 System.out.println(s.rollno + " " +s.name + " " + s.age);
         }
         
         
	}

}
