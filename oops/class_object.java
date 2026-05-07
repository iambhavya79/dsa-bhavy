package oops;

public class class_object {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        
    }
    
}
class Pen{
    int tip;
    String color;

    void setcolor(String newcolor){
       color  = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
        
 }


