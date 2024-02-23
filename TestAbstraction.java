abstract class Shape{
abstract void draw();
}

class Rectangle extends Shape{
void draw(){
System.out.println("Drawing rectangle");
}
}

class Circle extends Shape{
void draw(){
System.out.println("Drawing Circle");
}
}

class TestAbstraction{
public static void main(String args[]){
Shape s=new Circle(); //in real scenario,object is provided through method eg. getShape() method
s.draw();
}
}