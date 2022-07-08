class Outer1{
    int num = 5;
    void test(){ // Outer1 클래스의 메서드
        int num2 = 6;
        class LocalInClass { //클래스의 메서드 안에 있는 지역 내부 클래스
            void getPrint(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}

public class LocalInClassprt {
    public static void main(String[] args){
        Outer1 outer1 = new Outer1(); //Outer1 클래스의 객체 생성
        outer1.test(); // Outer1의 메서드 test를 객체 outer1로 호출하여 실행
    }
}
