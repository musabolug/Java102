package GenericClasses.Exercise;

import java.sql.Array;

public class MyList<T> {
    private T[] arr;
    private int index;
    private int capacity;
    public MyList(){
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int size){
        this.capacity = size +(10-(size%10));
        this.arr = (T[]) new Object[capacity];
    }

    public int size (){return this.index;}
    public int getCapacity() {return this.capacity;}
    public void add(T data){
        if (this.index == this.capacity){
            this.capacity+= capacity;
            T[] tempArr = (T[]) new Object[this.capacity-10];
            tempArr = this.arr.clone();

            this.arr = (T[]) new Object[this.capacity];

            int temp = 0;

            for (T item: tempArr){
                this.arr[temp] = item;
                temp++;
            }
            this.arr[this.index]=data;

        }
        else{
            this.arr[this.index]= data;
        }
        this.index++;
    }

    public T get(int index){
        if (this.index> index ){
            return this.arr[index];
        }
        return null;
    }

    public T remove(int index){

        if (index < this.index){
            T t= this.arr[index];
            for (;index < this.index;index++){
                this.arr[index] = this.arr[index+1];
            }
                this.index--;
                return t;
        }
        return null;
    }
    public void set (int index, T data){
            if (this.index > index){
                this.arr[index] = data;
            }
    }

    @Override
    public String toString(){
        String res="[";
        for (int index = 0; index < this.index; index++){
            if (index == this.index -1){
                res += (this.arr[index].toString());
            }
            else{
                res += (this.arr[index].toString() +",");
            }

        }
        res += "]";
        return res;
    }

    public int indexOf(T data ){
        int index  = 0;
        for (T item: this.arr){
            if (item == data){
                return index;
            }
            index++;
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for (int index = this.index-1;index >= 0;index--){
            if (this.arr[index]==data){
                return index;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.index==0;
    }
    public T[] toArray(){
        return this.arr.clone();
    }
    public void clear(){
        this.index = 0;
        this.capacity = 10;
        this.arr = (T[]) new Object[this.capacity];
    }
   public MyList<T> subList(int start, int finish){
            MyList arr = new MyList(finish-start+1);
            for (int index  = 0;start<= finish;start++,index++){
                arr.add(this.arr[start]);
            }
        return arr;
   }
   public boolean contains(T data){
        return indexOf(data) != -1;
   }

}
