enum MyEnum{
c1{
//Body of constant c1
public int getValue(){
return 100;
}
},
c2{
//Body of constant c2
public int getValue(){
return 10;
}
},
c3{
//Body of constant c3
public int getValue(){
return 0;
}
};
//Provide default implementation for getValue() method
public abstract int getValue();
}

//prints the names of the constants,their ordinals, and their custom values

public class EnumAbstractMethod{
public static void main(String args[]){
for(MyEnum s: MyEnum.values()){
String name = s.name();
int ordinal = s.ordinal();
int days = s.getValue();
System.out.println("name="+ name + ", ordinal=" + ordinal + ", days="+days);
}
}
}