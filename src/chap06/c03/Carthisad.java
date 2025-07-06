public class Carthisad {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 기본 생성자
    Carthisad() {
        // 기본 생성자 내용
    }

    Carthisad(String model) {
        this(model, "은색", 250); 
    }

    Carthisad(String model, String color) {
        this(model, color, 250); 
    }

    Carthisad(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}