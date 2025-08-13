package oopsassignment;
interface Certificate {
 void generateCertificate();
}
class Student implements Certificate {
 String name;
 long  rollNo;
 String course;
 Student(String name, long  rollNo, String course) {
     this.name = name;
     this.rollNo = rollNo;
     this.course = course;
 }
 public void generateCertificate() {
     System.out.println("----- COURSE COMPLETION CERTIFICATE -----");
     System.out.println("This is to certify that " + name + 
                        " (Roll No: " + rollNo + ") has successfully completed the course " + course + ".");
     System.out.println("------------------------------------------");
 }
}
public class generatecertificate {
 public static void main(String[] args) {
     Student s1 = new Student("SARANYA V",2117240020343L , "Java Programming");
     s1.generateCertificate();
 }
}

		



