package fengzhuang;

public class RunEncap{
    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");
        encap.setCityName("quzhou");

        System.out.println("Name : " + encap.getName()+"\n"+
                "Age : "+ encap.getAge()+ "\n"+"CityName : "+encap.getCityName());
    }
}