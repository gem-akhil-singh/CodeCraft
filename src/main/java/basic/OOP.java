package basic;

/*
 Write a Program to create a simple Student class which has name and college fields.
  Once the Class is created provide in Main Method try to create declare, create and initialize
  a Student object by passing below mentioned value and print them at console.
Name  as “ Test”, College as “BVB”
Name as  “ New Test”, College as " New FG”

 */
 class Student {

        private String studentName;
        private String studnetCollege;

        public Student(String studentName, String studnetCollege){
            this.studentName = studentName;
          this.studnetCollege = studnetCollege;
        }

        public String getName(){
            return studentName;
        }
        public String getCollege(){
            return studnetCollege;
        }

}

public class OOP{

    public static void main(String[] args) {
        Student s = new Student("Raja","IITD");
        System.out.println(s.getName());
        System.out.println(s.getCollege());
    }


}
