package OOP.Dependency_Bagimlilik;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Musab", "OLUG","1","Basaksehir",100);
        Student student2 = new Student("Bera", "OLUG","2","Basaksehir",90);
        Student student3 = new Student("Mansur", "OLUG","3","Basaksehir",95);

        Course mat =  new Course("MAT","101");
        Student[] stu ={student1,student2,student3};


        System.out.print("Ortalama :"+ mat.calcAverage(stu));
    }
}
