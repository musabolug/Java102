package MultiThreadsAndConcurrency;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Counter3 implements Runnable{
    private String name;
    private int id;
    private boolean isRun= true;
    public Counter3(String name,int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println(this.name+" calisti");
        int i = 0;
       while (isRun){
            try{
                Thread.sleep(1000L * this.id); // id değeri kadar bekliyor
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(this.name + " : " + i++);
        }

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void stop(){
        this.isRun=false;
    }
}
