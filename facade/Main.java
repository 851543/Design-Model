package facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}

class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA() {
        subSystemOne.methodOne();
    }

    public void methodB() {
        subSystemTwo.methodTwo();
    }

    public void methodC() {
        subSystemThree.methodThree();
    }
}

class SubSystemOne {
    public void methodOne() {
        System.out.println("执行子系统一的功能~");
    }
}

class SubSystemTwo {
    public void methodTwo() {
        System.out.println("执行子系统二的功能~");
    }
}

class SubSystemThree {
    public void methodThree() {
        System.out.println("执行子系统三的功能~");
    }
}