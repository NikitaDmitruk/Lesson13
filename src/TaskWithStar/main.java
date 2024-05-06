package TaskWithStar;

public class main {
    public static void main(String[] args) {
        try {
            int a = 5 / 1;
            System.exit(0); // Или если будет бесконечный цикл типа while(true){}
        } catch (ArithmeticException e) {
            System.out.println("А я сказал можно / на ноль!");
            System.exit(0); // Или если будет бесконечный цикл типа while(true){}
        } finally {
            System.out.println("Всегда выполняюсь!");
        }
    }
}
