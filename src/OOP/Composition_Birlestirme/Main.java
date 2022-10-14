package OOP.Composition_Birlestirme;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Musab", "OLUG","1","Basaksehir",100);
        Student student2 = new Student("Bera", "OLUG","2","Basaksehir",90);
        Student student3 = new Student("Mansur", "OLUG","3","Basaksehir",95);

        Instructor teacher =new Instructor("Oktay","Sinanoglu","KIMYA");
        Course kimya =  new Course("KIMYA","101",teacher);

        System.out.println(kimya.getInstructor().getName()+" "+kimya.getInstructor().getSurname());



    }
}
