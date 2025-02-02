public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
         */ // 싱글톤 패턴 구현할 때 보통 생성자를 private으로 선언하여 외부에서 인스턴스를 직접 생성하지 못해서 이렇게 코딩하면 오류남 

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다");
        } else {
            System.out.println("다른 Singleton 객체입니다");
        }
    }
}
