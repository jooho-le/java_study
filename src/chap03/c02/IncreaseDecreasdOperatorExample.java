public class IncreaseDecreasdOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------------------------");

        x++; // x=11
        ++x; // x=12
        System.out.println("x= " + x);

        System.out.println("----------------------------------------");

        y--; // y=9
        --y; // y=8
        System.out.println("y= " + y);

        System.out.println("----------------------------------------");

        z = x++; // z = 12, x=13   cause z = x 후에 x++
        System.out.println("z= " + z);
        System.out.println("x= " + x);

        System.out.println("----------------------------------------");

        z = ++x; // z=14, x=14    cause z = x+1
        System.out.println("z= " + z);
        System.out.println("x= " + x);

        System.out.println("----------------------------------------");

        z = ++x + y++;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
}
