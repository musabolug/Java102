package MultiThreadsAndConcurrency;

public class Counter2 implements Runnable{
    private String name;

    public Counter2(String name){
        this.name =name;
    }
    @Override
    public void run() {
        System.out.println(this.getName()+" sayaci basladi!");
        for (int i = 0; i <100; i++){
            System.out.println(this.getName()+" : "+ i);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
