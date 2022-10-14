package OOP.Dependency_Bagimlilik;

public class Course {
   private String name;
   private String code;

    public Course (String name, String code){
       this.name = name;
       this.code = code;

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
// Course uses a Student
    public double calcAverage(Student[] students){
        double average  = 0;
        for (Student student:students) {
            average += student.getNote();
        }
        return average / students.length;
    }
}
