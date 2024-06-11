// 1. Immediate parent class
// class A{
//     int i =10;
// }
// class B extends A{
//     int i=20;
//     void show(int i){
//         System.out.println(super.i);
//     }
//     public static void main(String[] args) {
//         B ob = new B();
//         ob.show(30);
//     }
// }





// 2. Invoke immidiate parent class
// class A{
//     void m1(){
//         System.out.println("hii");
//     }
// }
// class B extends A{
//     void show(){
//         super.m1();
//     }
//     public static void main(String[] args) {
//         B ob = new B();
//         ob.show();
//     }
// }


// 3. Invoke immidiate parent class constructor

// class A{
//     A(){
//         System.out.println(" hiii");
//     }
// }
// class B extends A{
//     B(){
//         super();
//         System.out.println("helloo");
//     }
//     public static void main(String[] args) {
//         B ob=new B();
//     }
// }