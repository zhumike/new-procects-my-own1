package learn1;

class Animal1{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog2 extends Animal1{
    public void move(){
        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }
}

public class TestDog2{
    public static void main(String args[]){

       Animal1 b = new Dog2(); // Dog2 对象
        b.move(); //执行 Dog2类的方法

    }
}