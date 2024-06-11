interface I1{
    public void show();
}
class test implements I1{
    public void show(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        test t = new test();
        t.show();
    }
}