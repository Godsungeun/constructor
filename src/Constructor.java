public class Constructor {
    public static void main(String[] args) {
        Car c = new Car("Model X", "빨간색", 250);
        System.out.println("제 차는 "+c.getModelName() + "이고, 컬러는 " + c.getColor()+"입니다.");
    }
}

class Car {
    private String modelName;
    private String color;
    private int maxSpeed;

    public Car(String modelName, String color, int maxSpeed){
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    // 위 아래가 둘 다 생성자인건가??
    public String getModelName(){
        return modelName;
        // Car 클래스 안의 메소드
        // 이건 내부클래스 아님!!
    }

    public String getColor(){
        return color;
    }
}