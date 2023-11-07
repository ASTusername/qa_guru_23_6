package qa.guru;

public class Main {
    public static void main(String[] args) {
        byte x = 100;
        byte y = 50;
        byte zz;
        int z;
        zz = (byte) (x + y);
        z = x + y;
        System.out.println(x + y);
        System.out.println(z);
        System.out.println("Переполнение" + zz);

        double a;
        double b;
        a = y/x;
        b = (double) y/x;
        System.out.printf("Деление целочисленное %s на %s 'y/x' равно = %s", y, x, a);
        System.out.println();
        System.out.printf("Деление %s на %s '(double) y/x' равно = %s ", y, x, b);
        System.out.println();

        if (x == 100 && z < 100) System.out.println("Из переменной x вычли что-то");
        else System.out.println("К переменной x прибавили что-то");
        System.out.println("Логические операторы---------------");

        int d;
        d = x + z;
        System.out.println("Сложили byte и int: " + d);
        double dDouble = 100.0;
        System.out.print("Сложили double и int: ");
        System.out.println(dDouble + d);
    }
}