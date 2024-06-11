class test{
    void show(){
        System.out.println("without extention");
    }
}
class xyz extends test{
    void show(){
        System.out.println("with extention");
    }
    public static void main(String[] args) {
        test t= new test();
        t.show();
        System.out.println("----");
        xyz x=new xyz();
        x.show();
    }
}