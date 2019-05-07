package fengzhuang;

public class EncapTest{

    private String name;
    private String idNum;
    private String cityName;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public String getCityName(){
        return cityName;
    }

    public void setAge( int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setIdNum( String newId){
        idNum = newId;
    }

    public void setCityName(String newcityName){
        cityName = newcityName;
    }
}