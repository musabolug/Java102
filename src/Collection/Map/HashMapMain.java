package Collection.Map;

import java.util.TreeMap;

public class HashMapMain {
    public static void main(String[] args) {

        //LinkedHashMap<Integer,Student> students = new LinkedHashMap<>();
        TreeMap<Integer,Student> students = new TreeMap<>(new OrderByNoComparator());
        // ters sıralamak için .reversed() de ekleyebilirsin

        students.put(200,new Student(200,"Musab",20));
        students.put(250,new Student(250,"Bera",40));
        students.put(300,new Student(300,"Mansur",60));


        for(Student stu : students.values()){
            System.out.println(stu.getName());
        }
    }
}
