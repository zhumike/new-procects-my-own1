package learn1;


/**
 * 多态的优点
 * 1. 消除类型之间的耦合关系
 * 2. 可替换性
 * 3. 可扩充性
 * 4. 接口性
 * 5. 灵活性
 * 6. 简化性
 * 多态存在的三个必要条件
 *1继承
 *2 重写
 *3父类引用指向子类对象
 */

public class DuotaiTest {
    public static void main(String[] args) {
        show(new Cat2());  // 以 Cat2 对象调用 show 方法
        show(new Dog3());  // 以 Dog3 对象调用 show 方法

        Animal2 a = new Cat2();  // 向上转型
        a.eat();               // 调用的是 Cat2 的 eat
        Cat2 c = (Cat2)a;        // 向下转型
        c.work();        // 调用的是 Cat2 的 work
    }

    public static void show(Animal2 a)  {
        a.eat();
        // 类型判断
        if (a instanceof Cat2)  {  // 猫做的事情
            Cat2 c = (Cat2)a;
            c.work();
        } else if (a instanceof Dog3) { // 狗做的事情
            Dog3 c = (Dog3)a;
            c.work();
        }
    }
}

abstract class Animal2 {
    abstract void eat();
}

class Cat2 extends Animal2 {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog3 extends Animal2 {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
