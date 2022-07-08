public class Test {
    public static void main(String[] argw){
        Example example = new Example();
        //첫번째 기본생성자 Example()가 실행된다
        Example example2 = new Example(5);
        // 두번째 생성자 Example(int x)가 실행되면서 this()의 영향으로
        // "기본 생성자 호출!"이 나온 후 "두번째 생성자 호출!" 출력
        // 여기서 정수형 아무 숫자나 들어가도 똑같은 실행을 한다. 5에 의미는 없음음
   }
}

class Example {
    public Example() {
        System.out.println("Example의 기본 생성자 호출!");
    };
    public Example(int x) {
        this();    // 첫 번째 기본 생성자가 호출된다
        System.out.println("Example의 두 번째 생성자 호출!");
    }
}
