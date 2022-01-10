public class Main {
    public static void main(String[] args) {
        BmService service = new BmService();
        int mass = 58;
        int height = 167;
        float bm = service.calculate(mass, height);
        System.out.println("Ваш индекс массы тела " + bm);

    }

}
