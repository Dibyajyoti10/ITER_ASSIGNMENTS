// 7. Write a java code that comprises of a class Address, having member
// variable plot no, at, post and required parameterised constructor. Create
// a Tree map having key as name of a person and value as address. 
// Insert required key and value in the created tree map and use an iterator to
// display it.

import java.util.*;
class Address{
    private String plotNo;
    private String at;
    private String post;

    Address(String plotNo, String at, String post){
        this.plotNo=plotNo;
        this.at=at;
        this.post=post;
    }
    public String getPlotNo() {
        return plotNo;
    }
    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }
    public String getAt() {
        return at;
    }
    public void setAt(String at) {
        this.at = at;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public String toString(){
        return "Address[plot number = "+plotNo+" ,at= "+at+" ,post= "+post+"]";
    }
}
public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> tm =new TreeMap<>();
        tm.put("Dibyajyoti", new Address("1A", "Jatni", "CityA"));
        tm.put("Suhani", new Address("2B", "Baripada", "CityB"));
        tm.put("Rohit", new Address("3C", "Mumbai", "CityC"));

        System.out.println("Address in the TreeMap are:");
        Iterator<String> itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            String name=itr.next();
            System.out.println("Name: "+name+" , address: "+tm.get(name));
        }

    }
}
