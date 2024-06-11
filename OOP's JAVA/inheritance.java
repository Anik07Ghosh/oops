// class Animal{
//     void eat(){
//         System.out.println("I am eating");
//     }
//     class Dog extends Animal{
//         public static void main(String[] args) {
//             Dog d = new Dog();
//             d.eat();
//         }
//     }
// }

// 1. Single Inheritance

// class A{
//     void showA(){
//         System.out.println("A class method");
//     }
// }
// class B extends A{
    
//     void showB(){
//         System.out.println("B class method");
//     }

// public static void main(String[] args) {
//     A ob1 = new A();
//     ob1.showA();
//     System.out.println("------");
//     B ob2 = new B();
//     ob2.showB();
//     ob2.showA();
// }
// }

// 2 Multilevel Inheritance

// class A{
//     void showA(){
//         System.out.println("A cclass method");
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("B class method");
//     }
// }
// class C extends B{
//     void showC(){
//         System.out.println("C class method");
//     }
//     public static void main(String[] args) {
//         A ob1 = new A();
//         ob1.showA();
//         System.out.println("-----");
//         B ob2 = new B();
//         ob2.showB();
//         ob2.showA();
//         System.out.println("----");
//         C ob3 = new C();
//         ob3.showA();
//         ob3.showB();
//         ob3.showC();
//     }
// }

// 3 Hierarchial Inheritance

class A{
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");
    }
}
class C extends A{
    void showC(){
        System.out.println("C class method");
    }
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.showA();
        System.out.println("----");
        B ob2 = new B();
        ob2.showA();
        ob2.showB();
        System.out.println("----");
        C ob3 = new C();
        ob3.showA();
        ob3.showC();
    }
}
