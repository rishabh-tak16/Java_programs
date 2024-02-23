interface drawable{
void draw();
default void msg(){System.out.println("deafult mthod");}
}

class Rectangle implements Drawable{
public void draw(){System.out.println("drawing rectangle");}
} 

class TestInterfaceDefault1{
public static void main(String args[]){
Drawable d=new Rectangle();
d.draw();
d.msg(); 
}
}
