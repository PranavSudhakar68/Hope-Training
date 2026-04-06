public class gettterSetter{
public static void main(String[] as){
Name n = new Name();
n.setName("umabharathi");
System.out.println(n.getName());
}
}
class Name{
    String name;
    public void setName(String n){

    this.name= n;

    }
    public String getName(){
        return this.name;
    }
}
