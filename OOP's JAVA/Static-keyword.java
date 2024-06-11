// 1. By variable
// class Test{
//     static int a = 10;
//     void m1(){
//         int b =20;
//     }
// }

// 2. By method

// class Test{
//     static void display(){
//         System.out.println("111");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.display();
//         display();
//     }
// }

// 3. By block

// class test{
//     static{
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }