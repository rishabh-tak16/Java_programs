import java.util.ArrayList;
class TestArrayList{
public static void main(String args[]){
ArrayList cityList = new ArrayList();
cityList.add("London");
cityList.add("New York");
cityList.add("Paris");
cityList.add(34.5);
cityList.add(2);
cityList.add("Paris");
System.out.println(cityList);
System.out.println("List size ? "+cityList.size());
System.out.println("Is London in the list? "+cityList.contains("London"));
System.out.println("The location of last paris in the list? "+cityList.lastIndexOf("Paris"));
System.out.println("Is the list empty? "+cityList.isEmpty());
cityList.add(2,"Beijing");
System.out.println(cityList.indexOf("Paris"));
cityList.remove("Paris");
cityList.remove(cityList.indexOf(2));
cityList.remove(2);//argument consider ass index
cityList.remove((Object)2);//argument is considered as object
for

}
}