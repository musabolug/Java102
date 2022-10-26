package Collection.TreeSetExample;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
     //   TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());//siralamayı tersten yapmak istersen .reversed() ekle
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());//siralamayı tersten yapmak istersen .reversed() ekle

        students.add(new Student("Musab",20));
        students.add(new Student("Bera",40));
        students.add(new Student("Mansur",60));
        students.add(new Student("Mansur",60));

        for(Student stu : students){
            System.out.println(stu.getName());
        }
    }

}
