class Outer {
    private int num =1 ;
    private static int sNum = 2;
    private InClass inClass;// 내부 클래스 자료형 변수 선언
    public Outer() {

        inClass = new InClass(); // 외부 클래스 생성자
    }
    class InClass { //Outer의 인스턴스 내부 클래스
        int inNum = 10; // 내부 클래스의 인스턴스 변수

        void Test(){
            System.out.println("Outer unm = " + num + "(외부 클래스의 인트턴스 변수)");
            System.out.println("Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");
            System.out.println(inNum);
        }
    }
    public void testClass() {
        inClass.Test();
    }
}
public class Main {
    public static void main(String[] args){
        Outer outer = new Outer();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
        outer.testClass(); // 내부 클래스 기능 호출
    }
}