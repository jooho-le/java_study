package chap06.c04;

public class Calculator_overloading {
    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) { // 같은 이름의 메소드, 오버로딩
        return width * height;
    }
}
