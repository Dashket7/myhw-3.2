// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 55;
        double height = 1.65;
        double result = service.calculate(weight, height);
        System.out.println(result);
    }
}