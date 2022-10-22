package GenericClasses;

public class NullableAll <T>{
    private final T value;

    public NullableAll(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
    public boolean isNull(){
        return this.getValue() == null;
    }
    public void run(){
        if (isNull()){
            System.out.println("NUll");
        }
        else{
            System.out.println(this.getValue());
        }
    }
}
