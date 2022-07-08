class OuterClass {
    private int number = 3; //내부 클래스의 인스턴스 변수
    private static int sNumber = 4;
    void getPrint() {
        System.out.println("인스턴스 메서드");
    }
    static void getPrintStatic(){
        System.out.println("스태틱 메서드");
    }
    static class StaticInClass { // 정적 내부 클래스
        void test(){
            System.out.println("Outer num = " + sNumber + "(외부 클래스의 정적 변수)");
            getPrintStatic();

        }
    }
}
public class StaticInClassPrt {
    public static void main(String[] args){
        OuterClass.StaticInClass a = new OuterClass.StaticInClass();
        a.test();
    }
}
