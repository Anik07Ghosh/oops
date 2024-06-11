// 1. using INSTANCE variable

// class ThisDemo{
//     int i;
//     void setvalue(int i){
//         this.i = i;
//     }
//     void show(){
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         ThisDemo td = new ThisDemo();
//         td.setvalue(101);
//         td.show();
//     }
// }

// 2. by INVOKE current class

// class ThisDemo{
//     void display(){
//         System.out.println("hellooo");
//     }
//     void show(){
//         this.display();
//     }
//     public static void main(String[] args) {
//         ThisDemo td = new ThisDemo();
//         td.show();
//     }
// }

// 3 invoke current class constructor

// class ThisDemo{
//     ThisDemo(){
//         System.out.println("No argument constructor");
//     }
//     ThisDemo(int a){
//         System.out.println("ARGUMENT CONSTRUCTOR");
//     }
//     public static void main(String[] args) {
//         ThisDemo td = new ThisDemo();
//         ThisDemo to = new ThisDemo(21);
//     }
// }


// 4. as an argument

// class ThisDemo{
//     void m1(ThisDemo td){
//         System.out.println("hemloooo");
//     }
//     void m2(){
//         m1(this);
//     }
//     public static void main(String[] args) {
//         ThisDemo td = new ThisDemo();
//         td.m2();
//     }
// }

// 5. pass as an argument in constructor call

// class Test{
//     Test(ThisDemo td){
//         System.out.println("Baklool");

//     }
// }
// class ThisDemo{
//     void m1(){
//         Test t = new Test(this);
//     }
//     public static void main(String[] args) {
//         ThisDemo t = new ThisDemo();
//         t.m1();
//     }
// }

//  6. return the current class instance

// class ThisDemo{
//     ThisDemo m1(){
//         return this;
//     }
//     public static void main(String[] args) {
//         ThisDemo t = new ThisDemo();
//         t.m1();
//     }
// }