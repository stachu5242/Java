package Kolo;



public class Message extends  Thread {
    @Override
    public void run(){
        sayDobranoc();
    }
    public void sayDobranoc(){
        System.out.print("Dobranoc ");
    }
}