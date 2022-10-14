package OOP.Composition_Birlestirme;

public class Course {
   private String name;
   private String code;
   private Instructor instructor;

    public Course (String name, String code,Instructor instructor){
       this.name = name;
       this.code = code;
       this.instructor = instructor;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Course uses a Student
    public double calcAverage(Student[] students){
        double average  = 0;
        for (Student student:students) {
            average += student.getNote();
        }
        return average / students.length;
    }
}
