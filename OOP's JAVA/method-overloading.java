class test{
    void show(){
        System.out.println("IT's without integer");
    }
    void show(int a){
        System.out.println("Integer value is"+a);
    }
    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.show(32);
    }
}
