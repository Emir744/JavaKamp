package odev2;

public class InstructorManager {
   public void add(Instructor instructor) {
	   System.out.println(instructor.getFirstName()+"Eklendi");
   }
   public void Register(Instructor instructor) {
	   System.out.println(instructor.getFirstName()+"Kay�t olundu");
   }
   public void Login(Instructor instructor) {
	 System.out.println(instructor.getFirstName()+" Giri� yap�ld�");  
   }
}
