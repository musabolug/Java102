package Collection.Map;

public class Student {
    int id;
    String name;
    int note;
    public Student(int id, String name, int note){
        this.id = id;
        this.name = name;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNote(){
        return this.note;
    }
    public void setNote(int note){
        this.note = note;
    }


}
