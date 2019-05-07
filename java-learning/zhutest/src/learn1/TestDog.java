package learn1;

//方法的override 子类重写父类的方法，子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！

/**
 方法的重写规则
 1.参数列表必须完全与被重写方法的相同；
 2.返回类型与被重写方法的返回类型可以不相同，但是必须是父类返回值的派生类（java5 及更早版本返回类型要一样，java7 及更高版本可以不同）；
 3.访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected。
 4.父类的成员方法只能被它的子类重写。
 5.声明为final的方法不能被重写。
 6.声明为static的方法不能被重写，但是能够被再次声明。
 7.子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
 8.子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
 9.重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
 10.构造方法不能被重写。
 11.如果不能继承一个方法，则不能重写这个方法。
 */

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
}

public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法

        b.move();//执行 Dog 类的方法
    }
}

