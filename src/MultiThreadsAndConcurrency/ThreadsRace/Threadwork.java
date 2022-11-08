package MultiThreadsAndConcurrency.ThreadsRace;

import java.util.ArrayList;

public class Threadwork implements Runnable{
    private int number= 1;
    private final Object LOCK = new Object();
    private ArrayList<Integer> dividedList = new ArrayList<>();
    private ArrayList<Integer> dividedList2 = new ArrayList<>();
    private ArrayList<Integer> dividedList3 = new ArrayList<>();
    private ArrayList<Integer> dividedList4 = new ArrayList<>();
    private ArrayList<Integer> oddNumber = new ArrayList<>();
    private ArrayList<Integer> evenNumber = new ArrayList<>();


    public  Threadwork(){

    }



    @Override
    public void run() {
            synchronized (LOCK){
                System.out.print(getNumber());
                if (this.number<=2500){
                    this.dividedList.add(number);
                    System.out.println(this.number + " " +" added to dividedList1");
                    System.out.println("###########################################");
                }else if (this.number>2500&& this.number<=5000){
                    this.dividedList2.add(number);
                    System.out.println(this.number+" " +"added yo dividedList2");
                    System.out.println("###########################################");
                }else if (this.number>5000&& this.number<=7500){
                    this.dividedList2.add(number);
                    System.out.println(this.number+" " +"added yo dividedList3");
                    System.out.println("###########################################");
                }else if (this.number>2500&& this.number<=5000){
                    this.dividedList2.add(number);
                    System.out.println(this.number+" " +"added yo dividedList2");
                    System.out.println("###########################################");
                }
                if (this.number%2  == 0){
                    this.evenNumber.add(number);
                    System.out.println(this.number+" "+ "added to evenList");
                }
                else{
                    this.oddNumber.add(number);
                    System.out.println(this.number+" "+ "added to oddList");
                }
                this.number++;
            }
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Object getLOCK() {
        return LOCK;
    }

    public ArrayList<Integer> getDividedList() {
        return dividedList;
    }

    public void setDividedList(ArrayList<Integer> dividedList) {
        this.dividedList = dividedList;
    }

    public ArrayList<Integer> getDividedList2() {
        return dividedList2;
    }

    public void setDividedList2(ArrayList<Integer> dividedList2) {
        this.dividedList2 = dividedList2;
    }

    public ArrayList<Integer> getDividedList3() {
        return dividedList3;
    }

    public void setDividedList3(ArrayList<Integer> dividedList3) {
        this.dividedList3 = dividedList3;
    }

    public ArrayList<Integer> getDividedList4() {
        return dividedList4;
    }

    public void setDividedList4(ArrayList<Integer> dividedList4) {
        this.dividedList4 = dividedList4;
    }

    public ArrayList<Integer> getOddNumber() {
        return oddNumber;
    }

    public void setOddNumber(ArrayList<Integer> oddNumber) {
        this.oddNumber = oddNumber;
    }

    public ArrayList<Integer> getEvenNumber() {
        return evenNumber;
    }

    public void setEvenNumber(ArrayList<Integer> evenNumber) {
        this.evenNumber = evenNumber;
    }
}
