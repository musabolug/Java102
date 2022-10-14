package OOP.Dependency_Bagimlilik;

public class Student {
    private String name;
    private String surname;
    private String idno;
    private String adress;

    private int note;

    public Student (String name, String surname, String idno, String adress, int note){
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.adress = adress;
        if (note > 100 || note < 0){
            note = 0;
        }
        this.note = note;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public  String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public  String getIdno(){
        return this.idno;
    }
    public void setIdno(String idno){
        this.idno = idno;
    }
    public  String getAdress(){
        return this.adress;
    }
    public void setAdress(String adress){
        this.adress= adress;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note > 100 || note < 0){
            note = 0;
        }
        this.note = note;
    }
}
